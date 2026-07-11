package api;

import modelos.Food;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.*;

public interface ComboApiService {
    
    @GET("api/foods")
    Call<List<Food>> listarCombos();

    @GET("api/foods/{id}")
    Call<Food> getById(@Path("id") int id);

    @POST("api/foods")
    Call<Void> create(@Body Food food);
    
}
