package api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiSala {
    
    private static final String APISALA_URL = "http://localhost:8080/";
    private static Retrofit retrofit = null;
    
    public static Retrofit getSala() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(APISALA_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
