public class child extends Parent {
    public child(int age) {
        super(age);
    }

    @Override
    public void greet() {
        System.out.println("Greet: child");
    }

    public static void main(String[] args) {
        child obj = new child(23);
        obj.greet();

        child.statGreet();
    }
}
