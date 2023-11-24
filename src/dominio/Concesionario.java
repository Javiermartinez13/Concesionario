package dominio;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private List<Vehiculo> catalogo;

    public Concesionario() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        catalogo.add(vehiculo);
    }

    public void mostrarCatalogo() {
        for (Vehiculo vehiculo : catalogo) {
            System.out.println("Marca: " + vehiculo.getMarca() +
                    ", Modelo: " + vehiculo.getModelo() +
                    ", Precio Final: " + vehiculo.calcularPrecioFinal());
        }
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0.0;
        for (Vehiculo vehiculo : catalogo) {
            precioTotal += vehiculo.calcularPrecioFinal();
        }
        return precioTotal;
    }

 
    
}