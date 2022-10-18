public class static2 {
    static int a = 5;
    static int b;

    static {
        System.out.println("static block is called when class is loaded for the first time");
        b = a * 5;
    }

    public static void main(String[] args) {
        static2 obj = new static2(); // static block will be called as soon as class is loaded.
        System.out.println(static2.a);
        System.out.println(static2.b);

        static2 obj2 = new static2(); // static block will not be called

    }

}
