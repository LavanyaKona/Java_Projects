package sortingObjs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }
        public static void main(String[] args) {
            Movie movie1 = new Movie(2005, 8.2, 500000, 1200000);
            Movie movie2 = new Movie(2010, 7.5, 700000, 1800000);
            Movie movie3 = new Movie(2015, 9.0, 800000, 2500000);

            List<Movie> movieList = new ArrayList<>(List.of(movie1, movie2, movie3));

            Comparator<Movie> ratingAndProfitComparator = new MoviesByRatingAndProfit();
            Collections.sort(movieList, ratingAndProfitComparator);

            System.out.println("Movies sorted by rating and profit:");
            movieList.forEach(movie -> System.out.println("Year: " + movie.getYearReleased() +
                    ", Rating: " + movie.getRating() +
                    ", Profit: $" + (movie.getCollectionAmount() - movie.getBudget())));

            Comparator<Movie> yearAndRatingComparator = new MoviesByYearAndRating();
            Collections.sort(movieList, yearAndRatingComparator);

            System.out.println("\nMovies sorted by year released and rating:");
            movieList.forEach(movie -> System.out.println("Year: " + movie.getYearReleased() +
                    ", Rating: " + movie.getRating()));
        }
    }
