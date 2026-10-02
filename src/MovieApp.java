
import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MovieRepository movieRepository = new ConsoleMovieRepository(); //Skapar ett lagringsinstance
        MovieService movieService = new MovieService(movieRepository); //Skickar in samma instance

        movieService.addMovie(new FeatureFilm("Shrek",90,"Animation"));
        movieService.addMovie(new Documentary("Livets gåta", 90,"livet"));

      //  System.out.println("Filmer i listan: " + movieRepository.getAll().size()); //Visar lagringen innan vi printar
        movieService.printAllMovies();
        System.out.println("Antal Filmer: " + movieService.getMovieCount());

        System.out.println("Sökning 1");
        movieService.printMoviesMatching("Shrek");

        System.out.println("Sökning 2");
        movieService.printMoviesMatching("Shrek");
        movieService.printMoviesMatching("LiVeTs gåta");

        System.out.println("Sökning 3");
        movieService.printMoviesMatching("Sagan om ringen");




        /*
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new FeatureFilm("Shrek", 90, "Animation"));
        movies.add(new Documentary("Livets gåta", 24, "Livet"));

        for(Movie movie : movies) {
            System.out.println(movie.describe());
        }

 */
    }
}
