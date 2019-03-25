package solucion;

public class VentaEfectivo extends Venta{

    public VentaEfectivo(int fecha) {
        super(fecha);
    }

    @Override
    public double precioTotal() {
        return precioParcial();
    }

}
