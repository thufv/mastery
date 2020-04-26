class CEGARAlgorithm {
    void run() {
        sizeOfReachedSetBeforeRefinement = reached.size();
        stats.refinementTimer.start();
        boolean refinementResult;
        try {
            refinementResult = mRefiner.performRefinement(reached);
        } catch (RefinementFailedException e) {
            stats.countFailedRefinements++;
            throw e;
        } finally {
            stats.refinementTimer.stop();
        }
    }
}
