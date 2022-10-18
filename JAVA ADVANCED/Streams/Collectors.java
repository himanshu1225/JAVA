import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

public class Collectors {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("jannat", 8),
                new Movie("akshar", 9),
                new Movie("bobby", 9));

        List<Movie> filtered = movies.stream().filter(movie -> movie.getLikes() > 8)
                .collect(java.util.stream.Collectors.toList());
        filtered.forEach(movie -> System.out.println(movie.getTitle()));

        // create a hashMap : key: movieTitle , value : movie Likes
        Map<String, Integer> movieMap = movies.stream().filter(m -> m.getLikes() > 8)
                .collect(java.util.stream.Collectors.toMap(m -> m.getTitle(), m -> m.getLikes()));
        System.out.println(movieMap);

        // Amazing collector:
        IntSummaryStatistics collect = movies.stream()
                .collect(java.util.stream.Collectors.summarizingInt(m -> m.getLikes()));
        System.out.println(collect);

        // joining collector to concatenate the title of the movies
        String joinedTitle = movies.stream().map(m -> m.getTitle()).collect(java.util.stream.Collectors.joining(","));
        System.out.println(joinedTitle);

        // grouping and partitioning are also there , see them if need in future
        // grouping: classify the movie objects.
        // Paritioning: to partition the objects based on condition.
    }
}
