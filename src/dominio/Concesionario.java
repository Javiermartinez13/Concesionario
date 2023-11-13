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

    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        VehiculoTurismo turismo1 = new VehiculoTurismo("Dacia", "Duster", 10000, 5);
        VehiculoTurismo turismo2 = new VehiculoTurismo("Honda", "Accord", 15000, 7);

        Furgoneta furgoneta1 = new Furgoneta("Ford", "Transit", 20000, 8);

        concesionario.agregarVehiculo(turismo1);
        concesionario.agregarVehiculo(turismo2);
        concesionario.agregarVehiculo(furgoneta1);

        concesionario.mostrarCatalogo();

        System.out.println("Precio total del catálogo: " + concesionario.calcularPrecioTotal());
    }
}