package solucion;

import java.util.ArrayList;
import java.util.List;

public abstract class Venta {

    protected List<Item> items;
    protected int fecha;

    public Venta(int fecha) {
        this.items = new ArrayList<>();
        this.fecha = fecha;
    }

    public void agregarItem(Item item){
        items.add(item);
    }

    protected double precioParcial(){
        return items.stream().mapToDouble(x -> x.precioParcial() ).sum();
    }

    public abstract double precioTotal();

    public void listar(){
        items.forEach(x -> System.out.println(x));
    }

    public int getFecha() {
        return fecha;
    }
}
