public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.set(2, 100);
        list.remove();
        list.get(0);
        System.out.println(list.size());
        System.out.println(list);

        CustomArrayList<String> list1 = new CustomArrayList<>();
        // list1.add("Hi");
        // list1.add("My");
        // list1.add("Name");
        // list1.add("Is");
        // list1.set(2, "Him");
        // list1.remove();
        // list1.get(0);
        // System.out.println(list1.size());
        // System.out.println(list1);

        // If i want to restrict that my arrayList should take only integer

    }
}
