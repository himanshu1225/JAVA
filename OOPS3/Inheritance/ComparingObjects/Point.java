public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        // getClass is this.getClass() isnstance of wala hi kaam ho rha
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    // @Override
    // public boolean equals(Object obj) {
    // // agar same hi reference ho pt1 hi pt1 se ho rha
    // if (this == obj)
    // return true;

    // // to avoid casting wala problem
    // if (!(obj instanceof Point))
    // return false;
    // Point other = (Point) obj;
    // return this.x == other.x && this.y == other.y;
    // }

    // implement hashcode also for best practice when you implement equals.

}