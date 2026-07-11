package api;

import modelos.Movie;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.DELETE;
import retrofit2.http.Path;
import retrofit2.http.Body;

public interface MovieApiService {

    @GET("api/movies")
    Call<List<Movie>> listarMovies();

    @GET("api/movies/{id}")
    Call<Movie> obtenerMovie(@Path("id") String id); 

    @POST("api/movies")
    Call<Movie> crearMovie(@Body Movie movie);

    @PUT("api/movies/{id}")
    Call<Movie> editarMovie(@Path("id") String id, @Body Movie movie);

    @DELETE("api/movies/{id}")
    Call<Void> eliminarMovie(@Path("id") String id);
}
