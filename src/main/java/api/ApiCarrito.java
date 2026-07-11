package api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCarrito {
    
    private static final String APICARRITO_URL = "http://localhost:8080/";
    private static Retrofit retrofit = null;

    public static Retrofit getCarrito() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(APICARRITO_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    
}
