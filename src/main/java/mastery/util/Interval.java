package mastery.util;

public class Interval {
    public final Integer l;
    public final Integer r;

    protected Interval(Integer l, Integer r) {
        this.l = l;
        this.r = r;
    }

    public static Interval of(Integer l, Integer r) {
        return new Interval(l, r);
    }

    public static boolean isSubinterval(Interval p, Interval q) {
        if (p == null) {
            return true;
        }
        else {
            if (q == null) {
                return false;
            }
            else {
                if (q.l <= p.l && p.r <= q.r) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }

    public static boolean isProperSubinterval(Interval p, Interval q) {
        return isSubinterval(p, q) && !equal(p, q);
    }

    public static boolean equal(Interval p, Interval q) {
        if (p == null) {
            return q == null;
        }
        else {
            return p.l == q.l && p.r == q.r;
        }
    }

    public static boolean in(Integer p, Interval i) {
        if (p == null || i == null) return false;
        else return i.l <= p && p <= i.r;
    }

    @Override
    public String toString() {
        return "[" + l + ", " + r + "]";
    }
}