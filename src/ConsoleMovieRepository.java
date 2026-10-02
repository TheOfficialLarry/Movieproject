import java.util.ArrayList;

public class ConsoleMovieRepository implements MovieRepository {
    private final ArrayList<Movie> movies = new ArrayList<>(); //Här finns arrayen i minnet.

    @Override
    public void add (Movie movie) {
        movies.add(movie); //Här lagras filmobjektet i vår Array
    }
    @Override
    public ArrayList<Movie> getAll() {
        return movies; //Här lämnas listan tillbaka med våra filmobjekt i Array
    }

}
