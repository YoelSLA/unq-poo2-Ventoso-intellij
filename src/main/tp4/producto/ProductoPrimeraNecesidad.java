package main.tp4.producto;

public class ProductoPrimeraNecesidad extends Producto {

    private static final double DESCUENTO = 0.9;

    public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * DESCUENTO;
    }
}
