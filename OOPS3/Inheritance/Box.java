public class Box {
    private double l;
    double w;
    double ht;

    Box() {
        System.out.println("Default: Box");
        this.l = -1;
        this.w = -1;
        this.ht = -1;
    }

    Box(double size) {
        this.l = size;
        this.w = size;
        this.ht = size;
    }

    Box(double l, double w, double ht) {
        this.l = l;
        this.w = w;
        this.ht = ht;
    }

    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.ht = old.ht;
    }

    public void information() {
        System.out.println("Box information");
    }

    @Override
    public String toString() {
        return "Box [ht=" + ht + ", l=" + l + ", w=" + w + "]";
    }

}