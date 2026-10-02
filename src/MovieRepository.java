import java.util.ArrayList;

public interface MovieRepository {
    void add (Movie movie);
    ArrayList<Movie> getAll();

}
