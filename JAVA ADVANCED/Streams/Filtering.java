import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filtering {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Harry Potter", 13));
        movies.add(new Movie("Avengers", 10));
        movies.add(new Movie("Bahubali", 7));
        movies.add(new Movie("Race", 2));
        movies.add(new Movie("Dabang", 4));

        // filtering and map are intermediate methods of stream and they return new
        // stream or pipe
        // forEach is terminal method, which consume the stream.

        // movies.stream().filter(movie -> (movie.getLikes() > 7 && movie.getLikes() <=
        // 10))
        // .forEach(movie -> System.out.println(movie.getTitle()));

        // Actuall filtering starts from forEach

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 7;
        movies.stream().filter(isPopular).forEach(movie -> System.out.print(movie.getTitle()));
    }
}
