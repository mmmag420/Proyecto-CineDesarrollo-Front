package service;

import api.ApiCarrito;
import api.CarritoApiService;
import modelos.Car;
import modelos.Food;
import retrofit2.Call;
import retrofit2.Response;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import modelos.Bill;
import modelos.Ticket;


public class CarritoServiceFront {
    
    private final CarritoApiService api;

    public CarritoServiceFront() {
        this.api = ApiCarrito.getCarrito().create(CarritoApiService.class);
    }

    public Car agregarCombo(Car carrito, Food combo) throws IOException {
        Map<String, Object> body = new HashMap<>();
        body.put("carrito", carrito);
        body.put("combo", combo);
        
        Call<Car> call = api.agregarCombo(body);
        Response<Car> resp = call.execute();
        return resp.isSuccessful() ? resp.body() : null;
    }

    public Car agregarEntrada(Car carrito, Ticket ticket) throws IOException {
        Map<String, Object> body = new HashMap<>();
        body.put("carrito", carrito);
        body.put("ticket", ticket);
        
        Call<Car> call = api.agregarEntrada(body);
        Response<Car> resp = call.execute();
        return resp.isSuccessful() ? resp.body() : null;
    }

    public boolean vaciarCarrito(Car carrito) throws IOException {
        Call<Void> call = api.vaciarCarrito(carrito);
        Response<Void> resp = call.execute();
        if (resp.isSuccessful()) {
            carrito.setIdCarrito(0);
            carrito.getCombos().clear();
            carrito.getEntradas().clear();
            carrito.setPrecioFinal(0.0);
            return true;
        }
        return false;
    }

    public Bill agregarCarritoEnFactura(Car carrito, Bill factura) throws IOException {
        Map<String, Object> body = new HashMap<>();
        body.put("carrito", carrito);
        body.put("factura", factura);
        
        Call<Bill> call = api.agregarCarritoEnFactura(body);
        Response<Bill> resp = call.execute();
        return resp.isSuccessful() ? resp.body() : null;
    }
    
}
