package service;

import api.ApiClient;
import api.ClienteApiService;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelos.Bill;
import modelos.Client;
import retrofit2.Call;
import retrofit2.Response;

public class ClienteServiceFront {
    
    private final ClienteApiService api; 
    
    public ClienteServiceFront() {
        this.api = ApiClient.getClient().create(ClienteApiService.class);
    }
    
    public List<Client> listarClientes() throws IOException {
        Call<List<Client>> call = api.listarClientes();
        Response<List<Client>> response = call.execute();
        return response.isSuccessful() ? response.body() : null;
    }
    
    public Client buscarCliente(String cedula) throws IOException {
        Call<Client> call = api.obtenerCliente(cedula);
        Response<Client> response = call.execute();
        return response.isSuccessful() ? response.body() : null;
    }
    
    public boolean guardarCliente(Client cliente) throws IOException {
        Call<Client> call = api.crearCliente(cliente);
        Response<Client> response = call.execute();
        return response.isSuccessful();
    }
    
    public boolean editarCliente(String cedula, Client cliente) throws IOException {
        Call<Client> call = api.editarCliente(cedula, cliente);
        Response<Client> response = call.execute();
        return response.isSuccessful();
    }
    
    public boolean eliminarCliente(String cedula) throws IOException {
        Call<Void> call = api.eliminarCliente(cedula);
        Response<Void> response = call.execute();
        return response.isSuccessful();
    }
    
    public List<Bill> listarFacturasDelCliente(String cedula) throws IOException {
        Call<List<Bill>> call = api.listarFacturasDelCliente(cedula);
        Response<List<Bill>> response = call.execute();
        if (response.isSuccessful()) {
            return response.body();
        } else {
            System.err.println("Error al listar facturas del cliente. Código: " + response.code());
            return null;
        }
    }

    public boolean agregarFacturaACliente(String cedula, Bill factura) throws IOException {
        Call<Bill> call = api.agregarFacturaACliente(cedula, factura);
        Response<Bill> response = call.execute();
        if (response.isSuccessful() && response.code() == 201) {
            return true;
        } else {
            System.err.println("Error al agregar la factura. Código: " + response.code());
            return false;
        }
    }
    
     public Client buscarPorCorreoYContraseña(String correo, String contraseña) throws IOException {
        Map<String, String> credenciales = new HashMap<>();
        credenciales.put("correo", correo);
        credenciales.put("contraseña", contraseña);

        Call<Client> call = api.login(credenciales);
        Response<Client> response = call.execute();

        if (response.isSuccessful()) {
            return response.body();
        } else {
            System.err.println("Error en login. Código HTTP: " + response.code());
            return null;
        }
    }
    
}
