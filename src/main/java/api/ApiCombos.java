package api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCombos {
    
    private static final String APICOMBOS_URL = "http://localhost:8080/";
    private static Retrofit retrofit = null;
    
    public static Retrofit getCombo() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(APICOMBOS_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    
}
