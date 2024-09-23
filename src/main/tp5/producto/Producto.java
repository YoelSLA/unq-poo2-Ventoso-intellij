package main.tp5.producto;

import main.tp5.Pagable;

public abstract class Producto implements Pagable {

    private double precioBase;
    private int stock;

    public Producto(double precioBase, int stock) {
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public void procesarPago() {
        this.stock--;
    }

    @Override
    public double getPrecio() {
        return getPrecioBase();
    }



}
