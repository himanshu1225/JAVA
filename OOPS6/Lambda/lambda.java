import java.util.ArrayList;
import java.util.function.Consumer;

public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> odd = new ArrayList<>();
        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);

        ArrayList<Integer> even = new ArrayList<>();
        // odd.forEach((item) -> even.add(item * 2));
        // System.out.println(even);

        // forEach: takes something known as consumer, so i can actaully store this as
        // consumer. Consumer is a interface
        Consumer<Integer> fun = (item) -> even.add(item * 2);
        odd.forEach(fun);
        System.out.println(even);

        Operation sum = (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        Operation diff = (a, b) -> a - b;

        lambda myCalc = new lambda();
        System.out.println(myCalc.operate(2, 3, diff));
        System.out.println(myCalc.operate(2, 3, sum));
        System.out.println(myCalc.operate(2, 3, product));

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    // creating own consumer
    public interface Operation {
        int operation(int a, int b);
    }
}