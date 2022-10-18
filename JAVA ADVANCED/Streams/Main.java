import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Harry Potter", 8));
        movies.add(new Movie("Avengers", 10));
        movies.add(new Movie("Bahubali", 7));
        movies.add(new Movie("Race", 2));
        movies.add(new Movie("Dabang", 4));

        // Find movies who's like is greater than or equal 7
        // int count = 0;
        // for (Movie movie : movies) {
        // if (movie.getLikes() >= 7) {
        // // System.out.println(movie.getTitle());
        // count++;
        // }
        // }
        // System.out.println(count);
        int count = (int) movies.stream()
                .filter(movie -> movie.getLikes() >= 7)
                .count();
        System.out.println(count);
    }
}
