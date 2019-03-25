package solucion;

public class Promocion implements IEstado {

    private double descuento;

    public Promocion(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double precioVenta(Prenda prenda) {
        return prenda.getPrecioBase() - descuento;
    }
}
