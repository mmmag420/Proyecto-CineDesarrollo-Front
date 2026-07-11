package api;

import java.util.Map;
import modelos.Bill;
import modelos.Car;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface CarritoApiService {
    
    @POST("api/carrito/combos")
    Call<Car> agregarCombo(@Body Map<String, Object> body);

    @POST("api/carrito/entradas")
    Call<Car> agregarEntrada(@Body Map<String, Object> body);

    @POST("api/carrito/vaciar")
    Call<Void> vaciarCarrito(@Body Car carrito);

    @POST("api/carrito/checkout")
    Call<Bill> agregarCarritoEnFactura(@Body Map<String, Object> body);
    
}
