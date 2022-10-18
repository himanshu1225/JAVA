import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Reducers {
    public static void main(String[] args) {
        // reducers are basically terminary operators
        // Reducers basically reduces the stream of objects into single object, which is
        // answer we are looking for
        List<Movie> movies = List.of(
                new Movie("akshar", 9),
                new Movie("jannat", 8),
                new Movie("bobby", 9),
                new Movie("bobby", 10));

        // count:
        System.out.println(movies.stream().count());

        // anyMatch: ek bhi aisa match ho jo condition satisfy kre.
        boolean anyMatch = movies.stream().anyMatch(movie -> movie.getLikes() > 10);
        System.out.println(anyMatch);

        // allMatch: Saare match krenge condition tho true;
        boolean allMatch = movies.stream().allMatch(movie -> movie.getLikes() > 0);
        System.out.println(allMatch);

        // noneMatch: none of the stream objects satisfy the elements.
        boolean noneMatch = movies.stream().noneMatch(movie -> movie.getLikes() > 10);
        System.out.println(noneMatch);

        // findFirst: first element in the stream return krega .
        // This returns the optional. (used to avoid null pointer exception)

        Optional<Movie> findFirst = movies.stream().findFirst();
        System.out.println(findFirst);
        System.out.println(findFirst.get());
        System.out.println(findFirst.get().getTitle());

        // findAny:
        String movie = movies.stream().findAny().get().getTitle();
        System.out.println(movie);

        // max and min
        // kabhi kabhi movie-> movie.getLikes() chalta nahi comparator me max min,
        // reversed me
        System.out.println(movies.stream().max(Comparator.comparing(Movie::getLikes)).get().getTitle());

    }
}
