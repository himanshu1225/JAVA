public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human himanshu = new Human(28, "Himanshu");
        Human twin = (Human) himanshu.clone();

        twin.arr[0] = 100;
        twin.age = 45;

        // This is actually shallow copy but only with the object (arr) not with
        // primitives
        System.out.println("Updated: ");
        System.out.println("Twin: " + twin);
        System.out.println("Original: " + himanshu);

        // Shallow copy is not pure clone.
        // Deep copy solves this problem.
        // what ever objects (arr) are present in human class make changes in clone fn

    }
}
