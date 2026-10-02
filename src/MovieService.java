import java.util.ArrayList;

public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository; // Samma repository i servicefältet
    }

    public void addMovie(Movie movie) {
        movieRepository.add(movie); //Skickar filmen vidare till repository
    }
    public void printAllMovies() {
        ArrayList<Movie> movies = movieRepository.getAll();  //Hämtar lagrade filmer från
        for (Movie movie : movies) {
            System.out.println(movie.describe()); //Printar ut rätt filmtypsbeskrivning
        }
    }
    public int getMovieCount() {
        return movieRepository.getAll().size();
    }
    public void printMoviesMatching(String searchText) {
        boolean found = false;

        for (Movie movie : movieRepository.getAll()) {
            if (movie.getTitle().toLowerCase().contains(searchText.toLowerCase())) {
                System.out.println(movie.describe());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found");
        }
    }
}
