package dominio;

public class VehiculoTurismo extends Vehiculo {
    private int numPlazas;

    public VehiculoTurismo(String marca, String modelo, double precioBase, int numPlazas) {
        super(marca, modelo, precioBase);
        this.numPlazas = numPlazas;
    }

    @Override
    public double calcularPrecioFinal() {
        if (numPlazas <= 5) {
            return getPrecioBase();
        } else {
            double aumentoPorPlaza = 0.10;
            int plazasAdicionales = numPlazas - 5;
            double aumentoTotal = aumentoPorPlaza * plazasAdicionales;

            return getPrecioBase() * (1 + aumentoTotal);
        }
    }
}