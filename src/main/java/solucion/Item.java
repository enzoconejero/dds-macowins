package solucion;

public class Item {

    private Prenda prenda;
    private int cantidad;

    public Item(Prenda prenda, int cantidad){

        //Deberia manejar que cantidad > 0
        this.prenda = prenda;
        this.cantidad = cantidad;
    }

    public double precioParcial(){
        return prenda.precioVenta() * cantidad;
    }

    @Override
    public String toString() {
        return "Prenda: "+prenda.getTipo().toString()+", Precio unitario: "+
                prenda.precioVenta()+", Cantidad: "+cantidad+", Total: "+precioParcial();
    }

}
