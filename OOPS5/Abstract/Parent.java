public abstract class Parent {

    int age;
    final int SALARY;

    public Parent(int age) {
        this.age = age;
        SALARY = 10_000;
    }

    public abstract void greet();

    public static void statGreet() {
        System.out.println("I am static method");
    }

}