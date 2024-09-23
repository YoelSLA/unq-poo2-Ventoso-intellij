package main.tp2;

public class Concepto {

    private String nombre;
    private double monto;

    public Concepto(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public Concepto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMonto() {
        return monto;
    }

}