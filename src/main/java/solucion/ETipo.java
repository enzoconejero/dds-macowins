package solucion;

public enum ETipo {
    CAMISA("Camisa"), SACO("Saco"), PANTALON("Pantalon");

    private String nombre;

    ETipo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
