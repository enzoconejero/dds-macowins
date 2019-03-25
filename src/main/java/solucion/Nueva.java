package solucion;

public class Nueva implements IEstado{

    @Override
    public double precioVenta(Prenda prenda) {
        return prenda.getPrecioBase();
    }

}
