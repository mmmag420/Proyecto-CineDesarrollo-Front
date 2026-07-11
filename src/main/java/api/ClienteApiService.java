package api;

import modelos.Client;
import java.util.List;
import java.util.Map;
import modelos.Bill;
import retrofit2.Call;
import retrofit2.http.*;

public interface ClienteApiService {
    
    @GET("api/clientes")
    Call<List<Client>> listarClientes();
    
    @GET("api/clientes/{cedula}")
    Call<Client> obtenerCliente(@Path("cedula") String cedula);
    
    @POST("api/clientes")
    Call<Client> crearCliente(@Body Client cliente);
    
    @PUT("api/clientes/{cedula}")
    Call<Client> editarCliente(@Path("cedula") String cedula, @Body Client cliente);
    
    @DELETE("api/clientes/{cedula}")
    Call<Void> eliminarCliente(@Path("cedula") String cedula);
    
    @POST("api/clientes/login")
    Call<Client> login(@Body Map<String, String> credenciales);

    @GET("api/clientes/{cedula}/facturas")
    Call<List<Bill>> listarFacturasDelCliente(@Path("cedula") String cedula);

    @POST("api/clientes/{cedula}/facturas")
    Call<Bill> agregarFacturaACliente(@Path("cedula") String cedula, @Body Bill factura);
    
}
