public class Interval {
  public void union() {
    if (low <= other.low && high >= other.high) {
      min = low;
    } else if (low >= other.low && high <= other.high) {
      min = other.high;
    } else {
      min = -1;
    }
  }
}
