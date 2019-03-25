package solucion;

public class Liquidacion implements IEstado {

    @Override
    public double precioVenta(Prenda prenda) {
        return prenda.getPrecioBase() * 0.5;
    }
}
