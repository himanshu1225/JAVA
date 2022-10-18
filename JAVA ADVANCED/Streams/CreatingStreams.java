import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        // Collections
        List<Integer> list = new ArrayList<>();
        list.stream();

        // Arrays
        int[] arr = new int[] { 1, 2, 3, 45 };
        // arr.stream()
        Arrays.stream(arr).forEach(ele -> System.out.println(ele));

        // Genreate infintely
        // a:
        Stream<Double> random = Stream.generate(() -> Math.random());
        random.limit(3).forEach(n -> System.out.println(n));

        // b.
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1);
        stream.limit(5).forEach(n -> System.out.println(n));
    }
}