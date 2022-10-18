public class BoxWeight extends Box {
    double wt;

    BoxWeight() {
        super();
        this.wt = -1;
        System.out.println("Default: BoxWt");

        super.information();
    }

    BoxWeight(double l, double w, double ht, double wt) {
        // super(l, w, ht);
        this.wt = wt;
    }

    @Override
    public String toString() {
        return "BoxWeight [wt=" + wt + "]";
    }

}
