import java.util.List;

public class Peek {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("jannat", 2),
                new Movie("akshar", 7),
                new Movie("bobby", 10),
                new Movie("deol", 12));

        // for checking the issues we use peek:
        // see how it flows by running it
        movies.stream().filter(movie -> movie.getLikes() > 5)
                .peek(m -> System.out.println(m.getTitle()))
                .map(movie -> movie.getLikes())
                .peek(m -> System.out.println("Mapped " + m))
                .forEach(m -> System.out.println(m));
    }
}
