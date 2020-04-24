class ATNSerializer {
    public IntegerList serialize() {
        serializeUUID(data, ATNSimulator.SERIALIZED_UUID);
        // convert grammar type to ATN const to avoid dependence on ANTLRParser
        switch(g.getType()) {
            case ANTLRParser.LEXER:
                data.add(ATNType.LEXER.ordinal());
                break;
            case ANTLRParser.PARSER:
            case ANTLRParser.COMBINED:
                data.add(ATNType.PARSER.ordinal());
                break;
            default:
                throw new UnsupportedOperationException("Invalid grammar type.");
        }
        data.add(g.getMaxTokenType());
        int nedges = 0;
        Map<IntervalSet, Integer> setIndices = new HashMap<IntervalSet, Integer>();
        List<IntervalSet> sets = new ArrayList<IntervalSet>();
        // dump states, count edges and collect sets while doing so
        IntegerList nonGreedyStates = new IntegerList();
        IntegerList precedenceStates = new IntegerList();
        data.add(atn.states.size());
        for (ATNState s : atn.states) {
            int stateType = s.getStateType();
            if (s instanceof DecisionState && ((DecisionState) s).nonGreedy) {
                nonGreedyStates.add(s.stateNumber);
            }
            if (s instanceof RuleStartState && ((RuleStartState) s).isPrecedenceRule) {
                precedenceStates.add(s.stateNumber);
            }
            if (s instanceof RuleStartState && ((RuleStartState) s).isPrecedenceRule) {
                precedenceStates.add(s.stateNumber);
            }
            data.add(stateType);
            if (s.ruleIndex == -1) {
                data.add(Character.MAX_VALUE);
            } else {
                data.add(s.ruleIndex);
            }
            if (s.getStateType() == ATNState.LOOP_END) {
                data.add(((LoopEndState) s).loopBackState.stateNumber);
            } else if (s instanceof BlockStartState) {
                data.add(((BlockStartState) s).endState.stateNumber);
            }
            if (s.getStateType() != ATNState.RULE_STOP) {
                // the deserializer can trivially derive these edges, so there's no need to serialize them
                nedges += s.getNumberOfTransitions();
            }
            for (int i = 0; i < s.getNumberOfTransitions(); i++) {
                Transition t = s.transition(i);
                int edgeType = Transition.serializationTypes.get(t.getClass());
                if (edgeType == Transition.SET || edgeType == Transition.NOT_SET) {
                    SetTransition st = (SetTransition) t;
                    if (!setIndices.containsKey(st.set)) {
                        sets.add(st.set);
                        setIndices.put(st.set, sets.size() - 1);
                    }
                }
            }
        }
        // non-greedy states
        data.add(nonGreedyStates.size());
        for (int i = 0; i < nonGreedyStates.size(); i++) {
            data.add(nonGreedyStates.get(i));
        }
        // precedence states
        data.add(precedenceStates.size());
        for (int i = 0; i < precedenceStates.size(); i++) {
            data.add(precedenceStates.get(i));
        }
        // precedence states
        data.add(precedenceStates.size());
        for (int i = 0; i < precedenceStates.size(); i++) {
            data.add(precedenceStates.get(i));
        }
        int nrules = atn.ruleToStartState.length;
        data.add(nrules);
        for (int r = 0; r < nrules; r++) {
            ATNState ruleStartState = atn.ruleToStartState[r];
            data.add(ruleStartState.stateNumber);
            if (g.isLexer()) {
                if (atn.ruleToTokenType[r] == Token.EOF) {
                    data.add(Character.MAX_VALUE);
                } else {
                    data.add(atn.ruleToTokenType[r]);
                }
                String ruleName = g.rules.getKey(r);
                Rule rule = g.getRule(ruleName);
                if (rule.actionIndex == -1) {
                    data.add(Character.MAX_VALUE);
                } else {
                    data.add(rule.actionIndex);
                }
            }
        }
        int nmodes = atn.modeToStartState.size();
        data.add(nmodes);
        if (nmodes > 0) {
            for (ATNState modeStartState : atn.modeToStartState) {
                data.add(modeStartState.stateNumber);
            }
        }
        int nsets = sets.size();
        data.add(nsets);
        for (IntervalSet set : sets) {
            boolean containsEof = set.contains(Token.EOF);
            if (containsEof && set.getIntervals().get(0).b == Token.EOF) {
                data.add(set.getIntervals().size() - 1);
            } else {
                data.add(set.getIntervals().size());
            }
            data.add(containsEof ? 1 : 0);
            for (Interval I : set.getIntervals()) {
                if (I.a == Token.EOF) {
                    if (I.b == Token.EOF) {
                        continue;
                    } else {
                        data.add(0);
                    }
                } else {
                    data.add(I.a);
                }
                data.add(I.b);
            }
        }
        data.add(nedges);
        for (ATNState s : atn.states) {
            if (s == null) {
                // might be optimized away
                continue;
            }
            if (s.getStateType() == ATNState.RULE_STOP) {
                continue;
            }
            for (int i = 0; i < s.getNumberOfTransitions(); i++) {
                Transition t = s.transition(i);
                if (atn.states.get(t.target.stateNumber) == null) {
                    throw new IllegalStateException("Cannot serialize a transition to a removed state.");
                }
                int src = s.stateNumber;
                int trg = t.target.stateNumber;
                int edgeType = Transition.serializationTypes.get(t.getClass());
                int arg1 = 0;
                int arg2 = 0;
                int arg3 = 0;
                switch(edgeType) {
                    case Transition.RULE:
                        trg = ((RuleTransition) t).followState.stateNumber;
                        arg1 = ((RuleTransition) t).target.stateNumber;
                        arg2 = ((RuleTransition) t).ruleIndex;
                        arg3 = ((RuleTransition) t).precedence;
                        break;
                    case Transition.PRECEDENCE:
                        PrecedencePredicateTransition ppt = (PrecedencePredicateTransition) t;
                        arg1 = ppt.precedence;
                        break;
                    case Transition.PREDICATE:
                        PredicateTransition pt = (PredicateTransition) t;
                        arg1 = pt.ruleIndex;
                        arg2 = pt.predIndex;
                        arg3 = pt.isCtxDependent ? 1 : 0;
                        break;
                    case Transition.RANGE:
                        arg1 = ((RangeTransition) t).from;
                        arg2 = ((RangeTransition) t).to;
                        if (arg1 == Token.EOF) {
                            arg1 = 0;
                            arg3 = 1;
                        }
                        break;
                    case Transition.ATOM:
                        arg1 = ((AtomTransition) t).label;
                        if (arg1 == Token.EOF) {
                            arg1 = 0;
                            arg3 = 1;
                        }
                        break;
                    case Transition.ACTION:
                        ActionTransition at = (ActionTransition) t;
                        arg1 = at.ruleIndex;
                        arg2 = at.actionIndex;
                        if (arg2 == -1) {
                            arg2 = 0xFFFF;
                        }
                        arg3 = at.isCtxDependent ? 1 : 0;
                        break;
                    case Transition.SET:
                        arg1 = setIndices.get(((SetTransition) t).set);
                        break;
                    case Transition.NOT_SET:
                        arg1 = setIndices.get(((SetTransition) t).set);
                        break;
                    case Transition.WILDCARD:
                        break;
                }
                data.add(src);
                data.add(trg);
                data.add(edgeType);
                data.add(arg1);
                data.add(arg2);
                data.add(arg3);
            }
        }
        int ndecisions = atn.decisionToState.size();
        data.add(ndecisions);
        for (DecisionState decStartState : atn.decisionToState) {
            data.add(decStartState.stateNumber);
        }
        // don't adjust the first value since that's the version number
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) < Character.MIN_VALUE || data.get(i) > Character.MAX_VALUE) {
                throw new UnsupportedOperationException("Serialized ATN data element out of range.");
            }
            int value = (data.get(i) + 2) & 0xFFFF;
            data.set(i, value);
        }
        return data;
    }
}
