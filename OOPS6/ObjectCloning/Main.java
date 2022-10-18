public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human himanshu = new Human(28, "Himanshu");
        // Human shenu = new Human(himanshu);

        // This new keyword for creating the clone of object is slow.
        // For cloning large object in less time use cloneable interface present in lang
        // package

        Human shenu = (Human) himanshu.clone();
        System.out.println(shenu);

    }
}
