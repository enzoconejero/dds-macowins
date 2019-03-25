package solucion;

import java.util.ArrayList;
import java.util.List;

public class RepoVentas {

    private List<Venta> ventas;

    public RepoVentas(List<Venta> ventas) {
        this.ventas = new ArrayList<>();
    }

    public double ganancias(int fecha){
        return ventas.stream().filter(x -> x.getFecha() == fecha).
                mapToDouble(x -> x.precioParcial()).sum();
    }

    public void agregarVenta(Venta venta){
        ventas.add(venta);
    }

}
