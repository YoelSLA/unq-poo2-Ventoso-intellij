package main.tp4;

import main.tp4.producto.Producto;

import java.util.ArrayList;

public class Supermercado {

    private String nombre, direccion;
    private ArrayList<Producto> productos;

    public Supermercado(String direccion, String nombre) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public int getCantidadDeProductos() {
        return productos.size();
    }

    public double getPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }


}

