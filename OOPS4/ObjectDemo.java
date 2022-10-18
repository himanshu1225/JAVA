public class ObjectDemo {
    public static void main(String[] args) {
        // ObjectDemo obj = new ObjectDemo();
        // System.out.println(obj.hashCode());
        // ObjectDemo obj1 = new ObjectDemo();
        // System.out.println(obj1.hashCode());
        // ObjectDemo obj2 = obj1;
        // System.out.println(obj2.hashCode());

        String name = "Himanshu";
        String naam = new String("Himanshu");
        System.out.println(name == naam);
        System.out.println(name.equals(naam));
        System.out.println(name instanceof String);
        System.out.println(naam.getClass());

        System.out.println(naam.getClass().getName());
    }
}