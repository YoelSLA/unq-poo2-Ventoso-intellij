package main.tp5.producto;

public class ProductoCooperativa extends Producto {

    public ProductoCooperativa(double precioBase, int stock) {
        super(precioBase, stock);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * 0.10;
    }

}
