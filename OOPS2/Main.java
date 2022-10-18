public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.greeting();

        Singleton objj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

    }

    public void greeting() {
        System.out.println("I am greet");
    }
}
