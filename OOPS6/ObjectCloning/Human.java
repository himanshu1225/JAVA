public class Human implements Cloneable {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    public String toString() {
        return "Human [age=" + age + ", name=" + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}