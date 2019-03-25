package solucion;

public class Prenda {

    private double precioBase;
    private ETipo tipo;
    private IEstado estado;

    public Prenda(double precioBase, ETipo tipo, IEstado estado) {
        this.precioBase = precioBase;
        this.tipo = tipo;
        this.estado = estado;
    }

    public double precioVenta(){
        return estado.precioVenta(this);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public ETipo getTipo() {
        return tipo;
    }

    public void setTipo(ETipo tipo) {
        this.tipo = tipo;
    }

    public IEstado getEstado() {
        return estado;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }
}
