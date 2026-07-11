package api;

import java.util.List;
import java.util.Map;
import modelos.Hall;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SalaApiService {
    
    @GET("api/salas/cartelera/{dia}")
    Call<List<Hall>> carteleraPorDia(@Path("dia") Hall.Dia dia);

    @GET("api/salas/{idSala}/funciones")
    Call<List<Hall>> funcionesPorSalaYDia(@Path("idSala") int idSala,
                                          @Query("dia") Hall.Dia dia);

    @GET("api/salas/funcion")
    Call<Hall> obtenerFuncion(@Query("sala") int sala,
                              @Query("dia") Hall.Dia dia,
                              @Query("horaInicio") String horaInicio);

    @GET("api/salas/funcion/sillas")
    Call<boolean[]> estadoSillas(@Query("sala") int sala, @Query("dia") Hall.Dia dia, @Query("horaInicio") String horaInicio /* "HH:mm" */);

    @POST("api/salas/funcion/reservar")
    Call<Void> reservar(@Body Map<String, Object> body);

    @POST("api/salas/funcion/cancelar")
    Call<Void> cancelar(@Body Map<String, Object> body);
    
    @POST("api/salas/{id}/limpiar")
    Call<Map<String, Object>> limpiarSala(@Path("id") int idSala);

    @POST("api/salas/funcion")
    Call<Hall> crearFuncion(@Body Map<String, Object> body);

    @POST("api/salas/crear-por-defecto/auto")
    Call<Map<String, Object>> crearFuncionesPorDefectoAuto(
        @Query("movieId") Integer movieId,
        @Query("capacidad") Integer capacidad
    );
    
}
