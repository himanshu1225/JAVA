public class ShapeMain {
    public static void main(String[] args) {
        Shape sh = new Shape();
        // sh.area();

        Square sq = new Square();
        sq.area();

        Circle cir = new Circle();
        cir.area();
        cir.greeting();

        Shape sc = new Circle();
        sc.area();

        sc.greeting();
    }
}
