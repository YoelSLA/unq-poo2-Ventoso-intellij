package main.tp5.factura;

public class Servicio extends Factura {

    private int cantidadUnidadesConsumidas;
    private double costoPorUnidad;

    public Servicio(int cantidadUnidadesConsumidas, double costoPorUnidad) {
        this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
        this.costoPorUnidad = costoPorUnidad;
    }

    public int getCantidadUnidadesConsumidas() {
        return cantidadUnidadesConsumidas;
    }

    public double getCostoPorUnidad() {
        return costoPorUnidad;
    }

    @Override
    public double getPrecio() {
        return getCantidadUnidadesConsumidas() * getCostoPorUnidad();
    }

}
