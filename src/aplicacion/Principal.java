package aplicacion;

import dominio.Concesionario;
import dominio.Furgoneta;
import dominio.VehiculoTurismo;

public class Principal {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        VehiculoTurismo turismo1 = new VehiculoTurismo("Dacia", "Duster", 10000, 5);
        VehiculoTurismo turismo2 = new VehiculoTurismo("Honda", "Accord", 15000, 7);

        Furgoneta furgoneta1 = new Furgoneta("Ford", "Transit", 20000, 7);

        concesionario.agregarVehiculo(turismo1);
        concesionario.agregarVehiculo(turismo2);
        concesionario.agregarVehiculo(furgoneta1);

        concesionario.mostrarCatalogo();

        System.out.println("Precio total del catálogo es: " + concesionario.calcularPrecioTotal());
    }
    
}
