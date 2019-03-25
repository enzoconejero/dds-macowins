package solucion;

public class VentaTarjeta extends Venta{

    private static double coeficiente_fijo = 0.3;
    private int cuotas;

    public VentaTarjeta(int fecha, int cuotas) {
        super(fecha);
        this.cuotas = cuotas;
    }

    @Override
    public double precioTotal() {
        return precioParcial() * (1 + 0.01 + cuotas * coeficiente_fijo);
    }

}
