import java.util.List;
import java.util.Optional;

public class ReducingStream {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("jannat", 8),
                new Movie("akshar", 9),
                new Movie("bobby", 9));

        Optional<Integer> reducedResult = movies.stream().map(movie -> movie.getLikes()).reduce((a, b) -> a + b);
        // [8,9,9]
        // [17, 9]
        // [26]
        System.out.println(reducedResult.get());
        // reducedResult.get() may result 0.
        System.out.println(reducedResult.orElse(0));
        // Will return result or 0;

    }
}
