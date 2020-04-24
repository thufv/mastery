class ATNSerializer {
	public IntegerList serialize() {
		// convert grammar type to ATN const to avoid dependence on ANTLRParser
		if ( g.getType()== ANTLRParser.LEXER ) data.add(ATN.LEXER);
		else if ( g.getType()== ANTLRParser.PARSER ) data.add(ATN.PARSER);
		else data.add(ATN.TREE_PARSER);
		data.add(g.getMaxTokenType());
		int nedges = 0;

		// dump states, count edges and collect sets while doing so
		IntegerList nonGreedyStates = new IntegerList();
		data.add(atn.states.size());
		for (ATNState s : atn.states) {
			int stateType = s.getStateType();
			if (s instanceof DecisionState && ((DecisionState)s).nonGreedy) {
				nonGreedyStates.add(s.stateNumber);
			}

			data.add(stateType);
			data.add(s.ruleIndex);
			if ( s.getStateType() == ATNState.LOOP_END ) {
				data.add(((LoopEndState)s).loopBackState.stateNumber);
			}
			else if ( s instanceof BlockStartState ) {
				data.add(((BlockStartState)s).endState.stateNumber);
			}

			if (s.getStateType() != ATNState.RULE_STOP) {
				// the deserializer can trivially derive these edges, so there's no need to serialize them
				nedges += s.getNumberOfTransitions();
			}

			for (int i=0; i<s.getNumberOfTransitions(); i++) {
				Transition t = s.transition(i);
				int edgeType = Transition.serializationTypes.get(t.getClass());
				if ( edgeType == Transition.SET || edgeType == Transition.NOT_SET ) {
					SetTransition st = (SetTransition)t;
					sets.add(st.set);
				}
			}
		}

		// non-greedy states
		data.add(nonGreedyStates.size());
		for (int i = 0; i < nonGreedyStates.size(); i++) {
			data.add(nonGreedyStates.get(i));
		}

		int nrules = atn.ruleToStartState.length;
		data.add(nrules);
		for (int r=0; r<nrules; r++) {
			ATNState ruleStartState = atn.ruleToStartState[r];
			data.add(ruleStartState.stateNumber);
			if ( g.isLexer() ) {
				data.add(atn.ruleToTokenType[r]);
				String ruleName = g.rules.getKey(r);
				Rule rule = g.getRule(ruleName);
				data.add(rule.actionIndex);
			}
		}

		int nmodes = atn.modeToStartState.size();
		data.add(nmodes);
		if ( nmodes>0 ) {
			for (ATNState modeStartState : atn.modeToStartState) {
				data.add(modeStartState.stateNumber);
			}
		}

		int nsets = sets.size();
		data.add(nsets);
		for (IntervalSet set : sets) {
			data.add(set.getIntervals().size());
			for (Interval I : set.getIntervals()) {
				data.add(I.a);
				data.add(I.b);
			}
		}

		data.add(nedges);
		int setIndex = 0;
		for (ATNState s : atn.states) {
			if ( s==null ) {
				// might be optimized away
				continue;
			}

			if (s.getStateType() == ATNState.RULE_STOP) {
				continue;
			}

			for (int i=0; i<s.getNumberOfTransitions(); i++) {
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
				switch ( edgeType ) {
					case Transition.RULE :
						trg = ((RuleTransition)t).followState.stateNumber;
						arg1 = ((RuleTransition)t).target.stateNumber;
						arg2 = ((RuleTransition)t).ruleIndex;
						break;
					case Transition.PREDICATE :
						PredicateTransition pt = (PredicateTransition)t;
						arg1 = pt.ruleIndex;
						arg2 = pt.predIndex;
						arg3 = pt.isCtxDependent ? 1 : 0 ;
						break;
					case Transition.RANGE :
						arg1 = ((RangeTransition)t).from;
						arg2 = ((RangeTransition)t).to;
						break;
					case Transition.ATOM :
						arg1 = ((AtomTransition)t).label;
						break;
					case Transition.ACTION :
						ActionTransition at = (ActionTransition)t;
						arg1 = at.ruleIndex;
						arg2 = at.actionIndex;
						arg3 = at.isCtxDependent ? 1 : 0 ;
						break;
					case Transition.SET :
						arg1 = setIndex++;
						break;
					case Transition.NOT_SET :
						arg1 = setIndex++;
						break;
					case Transition.WILDCARD :
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
		return data;
	}
}
