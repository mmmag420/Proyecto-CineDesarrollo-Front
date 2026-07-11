package service;

import api.ApiCombos;
import api.ComboApiService;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import modelos.Food;
import retrofit2.Call;
import retrofit2.Response;

public class ComboServiceFront {
    
    private final ComboApiService api; 
    
    public ComboServiceFront() {
        this.api = ApiCombos.getCombo().create(ComboApiService.class);  
    }
    
    public List<Food> listarCombos() throws IOException {
        Call<List<Food>> call = api.listarCombos();
        Response<List<Food>> response = call.execute();
        return response.isSuccessful() && response.body() != null? response.body(): Collections.emptyList();
    }    
    
    public Food buscarCombo(int id) throws IOException {
        Call<Food> call = api.getById(id);
        Response<Food> response = call.execute();
        if (response.isSuccessful()) {
            return response.body();          
        }
        if (response.code() == 404) {
            return null;                     
        }
        return null;                         
    }

    public boolean crearCombo(Food food) throws IOException {
        Call<Void> call = api.create(food);
        Response<Void> response = call.execute();
        return response.isSuccessful();
    }       
    
}
