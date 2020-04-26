class CEGARAlgorithm {
  void run(){
    stats.refinementTimer.start();
    boolean refinementResult = mRefiner.performRefinement(reached);
    stats.refinementTimer.stop();
  }
}