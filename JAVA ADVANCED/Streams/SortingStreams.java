
import java.util.Comparator;
import java.util.List;

public class SortingStreams {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("jannat", 8),
                new Movie("akshar", 9),
                new Movie("bobby", 9));

        // This will use implementation of compareTo method defined in Movie when
        // implemets functional interface Comparable .
        // movies.stream().sorted().forEach(movie ->
        // System.out.println(movie.getTitle()));

        // Direct use lambda method and compareTo method
        // movies.stream().sorted((m1, m2) -> m1.compareTo(m2)).forEach(movie ->
        // System.out.println(movie.getTitle()));

        // or Using Comparator also we can sort
        // movies.stream().sorted(Comparator.comparing(m -> m.getTitle()))
        // .forEach(movie -> System.out.println(movie.getTitle()));

        movies.stream().sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(movie -> System.out.println(movie.getTitle()));
    }
}
