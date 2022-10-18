import java.util.ArrayList;
import java.util.List;

public class Slicing {
    public static void main(String[] args) {
        // Slicing: limit, skip, takeWhile, dropWhile

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Harry Potter", 12));
        movies.add(new Movie("Avengers", 10));
        movies.add(new Movie("Bahubali", 13));
        movies.add(new Movie("Race", 2));
        movies.add(new Movie("Dabang", 15));

        // 1. limit
        // movies.stream().limit(3).forEach(movie ->
        // System.out.println(movie.getTitle()));

        // 2. skip: for pagination.
        // movies.stream().skip(2).forEach(movie ->
        // System.out.println(movie.getTitle()));

        // Diff between takeWhile and filter is that : filter will iterate over entire
        // dataSource and takeWhile will interate only till the condition is true, once
        // predicate becomes false it stops there

        movies.stream().takeWhile(movie -> movie.getLikes() >= 10)
                .forEach(movie -> System.out.println(movie.getTitle()));

        // movies.stream().dropWhile(movie -> movie.getLikes() >= 10)
        // .forEach(movie -> System.out.println(movie.getTitle()));

    }
}
