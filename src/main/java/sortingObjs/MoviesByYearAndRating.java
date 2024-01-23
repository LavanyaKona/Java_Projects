package sortingObjs;

import java.util.Comparator;

public class MoviesByYearAndRating implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getYearReleased() > m2.getYearReleased()
                && m1.getRating() > m2.getRating()) {
            return 1;
        } else if (m1.getYearReleased() < m2.getYearReleased()
                && m1.getRating() < m2.getRating()) {
            return -1;
        } else {
            return 0;
        }
    }
}
