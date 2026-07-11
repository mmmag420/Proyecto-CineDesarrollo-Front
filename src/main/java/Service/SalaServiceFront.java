package Service;

import api.ApiSala;
import api.SalaApiService;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelos.Hall;
import retrofit2.Call;
import retrofit2.Response;

public class SalaServiceFront {
    
    private final SalaApiService api;

    public SalaServiceFront() {
        this.api = ApiSala.getSala().create(SalaApiService.class);
    }

    public List<Hall> carteleraPorDia(Hall.Dia dia) throws IOException {
        Call<List<Hall>> call = api.carteleraPorDia(dia);
        Response<List<Hall>> resp = call.execute();
        return resp.isSuccessful() ? resp.body() : null;
    }

    public List<Hall> funcionesPorSalaYDia(int idSala, Hall.Dia dia) throws IOException {
        Call<List<Hall>> call = api.funcionesPorSalaYDia(idSala, dia);
        Response<List<Hall>> resp = call.execute();
        return resp.isSuccessful() ? resp.body() : null;
    }

    public Hall obtenerFuncion(int sala, Hall.Dia dia, String horaInicioHHmm) throws IOException {
        Call<Hall> call = api.obtenerFuncion(sala, dia, horaInicioHHmm);
        Response<Hall> resp = call.execute();
        return resp.isSuccessful() ? resp.body() : null;
    }

    public boolean[] estadoSillas(int sala, Hall.Dia dia, String horaInicioHHmm) throws IOException {
        Call<boolean[]> call = api.estadoSillas(sala, dia, horaInicioHHmm);
        Response<boolean[]> resp = call.execute();
        return resp.isSuccessful() ? resp.body() : null;
    }

    public boolean reservarSillas(int sala, Hall.Dia dia, String horaInicioHHmm, List<Integer> asientos) throws IOException {
        Map<String, Object> body = new HashMap<>();
        body.put("sala", sala);
        body.put("dia", dia.name());          
        body.put("horaInicio", horaInicioHHmm);   
        body.put("asientos", asientos);

        Call<Void> call = api.reservar(body);
        Response<Void> resp = call.execute();
        if (!resp.isSuccessful()) {
            System.err.println("Error al reservar: HTTP " + resp.code());
        }
        return resp.isSuccessful(); 
    }

    public boolean cancelarSilla(int sala, Hall.Dia dia, String horaInicioHHmm, int asiento) throws IOException {
        Map<String, Object> body = new HashMap<>();
        body.put("sala", sala);
        body.put("dia", dia.name());
        body.put("horaInicio", horaInicioHHmm);
        body.put("asiento", asiento);

        Call<Void> call = api.cancelar(body);
        Response<Void> resp = call.execute();
        if (!resp.isSuccessful()) {
            System.err.println("Error al cancelar: HTTP " + resp.code());
        }
        return resp.isSuccessful(); 
    }

    

    public boolean limpiarSalaPorIdOK(int idSala) throws IOException {
        Call<Map<String, Object>> call = api.limpiarSala(idSala);
        Response<Map<String, Object>> resp = call.execute();

        if (!resp.isSuccessful()) {
            System.err.println("Error al limpiar sala: HTTP " + resp.code());
        }
        return resp.isSuccessful();
    }

    public Hall crearFuncion(int sala, String movieId, Hall.Dia dia,
                             String horaInicioHHmm, String horaFinHHmm, int capacidad) throws IOException {

        Map<String, Object> body = new HashMap<>();
        body.put("sala", sala);
        body.put("movieId", movieId);
        body.put("dia", dia.name());
        body.put("horaInicio", horaInicioHHmm);
        body.put("horaFin", horaFinHHmm);
        body.put("capacidad", capacidad);

        Call<Hall> call = api.crearFuncion(body);
        Response<Hall> resp = call.execute();

        if (resp.isSuccessful()) {
            return resp.body();
        } else {
            System.err.println("Error al crear función: HTTP " + resp.code());
            return null;
        }
    }

    public boolean crearFuncionesPorDefectoAuto(Integer movieId, Integer capacidad) throws IOException {
        Call<Map<String, Object>> call = api.crearFuncionesPorDefectoAuto(movieId, capacidad);
        Response<Map<String, Object>> resp = call.execute();
        if (!resp.isSuccessful()) {
            System.err.println("Error al crear funciones auto: HTTP " + resp.code());
            if (resp.errorBody()!=null) System.err.println(resp.errorBody().string());
            return false;
        }
        return true;
    }  
    
    
    
}
