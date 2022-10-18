import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TransformStream {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Harry Potter", 8));
        movies.add(new Movie("Avengers", 10));
        movies.add(new Movie("Bahubali", 7));
        movies.add(new Movie("Race", 2));
        movies.add(new Movie("Dabang", 4));

        // To transform the streams: map, flatMap

        movies.stream().map(movie -> movie.getTitle()).forEach(n -> System.out.println(n));
        // movies.stream().filter(movie -> movie.getTitle()).forEach(n ->
        // System.out.println(n));
        // filter wont work becuase it expects predicate which return boolean
        // Here what we are doing is every movie object stream is transforming into
        // getTitle Stream

        // primitive variations of map
        movies.stream().mapToInt(movie -> movie.getLikes()).forEach(n -> System.out.println(n));

        // flat Map
        Stream<List<Integer>> stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        // stream.forEach(l -> System.out.print(l));

        // list -> list of lists
        // in flatMap getting list and converting into stream
        stream.flatMap(list -> list.stream()).forEach(n -> System.out.print(n));
    }
}
