import java.util.List;

public class UniqueElements {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("jannat", 8),
                new Movie("akshar", 9),
                new Movie("bobby", 9),
                new Movie("bobby", 10));

        movies.stream().map(movie -> movie.getLikes()).distinct().forEach(d -> System.out.println(d));
    }
}
