package main.tp4.producto;

public class Producto {

    private String nombre;
    private double precio;
    private boolean esPrecioCuidado = false;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precio, boolean esPrecioCuidado) {
        this(nombre, precio);
        this.esPrecioCuidado = esPrecioCuidado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean esPrecioCuidado() {
        return esPrecioCuidado;
    }

    public void aumentarPrecio(double precio) {
        this.precio += precio;
    }
}
