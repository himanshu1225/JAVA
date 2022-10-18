public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    static void message() {
        System.out.println("");
    }
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // this.popualtion += 1; but as it is class vairable, access using Class name.
        Human.message();
    }
}