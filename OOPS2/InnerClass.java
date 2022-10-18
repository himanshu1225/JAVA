class Test {
    static String name;

    public Test(String name) {
        Test.name = name;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Test A = new Test("himanshu");
        Test B = new Test("shenu");

        System.out.println(A.name); // shenu
        System.out.println(B.name); // shenu
    }

}
