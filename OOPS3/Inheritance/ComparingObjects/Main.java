public class Main {
    public static void main(String[] args) {
        Point pt1 = new Point(1, 2);
        Point pt2 = new Point(1, 2);

        // default implementation of equals w.r.t to reference
        // Override it.
        // System.out.println(pt1.equals("hello"));
        System.out.println(pt1.equals(pt2));
        System.out.println(pt1.equals(pt1));

    }
}
