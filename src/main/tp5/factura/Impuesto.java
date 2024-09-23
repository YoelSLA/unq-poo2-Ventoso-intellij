package main.tp5.factura;

public class Impuesto extends Factura {

    private double tasaServicio;

    public Impuesto(double tasaServicio) {
        this.tasaServicio = tasaServicio;
    }

    @Override
    public double getPrecio() {
        return tasaServicio;
    }

}
