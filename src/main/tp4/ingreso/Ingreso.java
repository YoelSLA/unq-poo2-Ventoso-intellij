package main.tp4.ingreso;

import java.time.Month;

public class Ingreso {

    private double monto;
    private String concepto;
    private Month mesDePercepcion;

    public Ingreso(double monto, String concepto, Month  mesDePercepcion) {
        this.monto = monto;
        this.concepto = concepto;
        this.mesDePercepcion = mesDePercepcion;
    }

    public double getMontoImponible() {
        return monto;
    }

    public double getMonto() {
        return monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public Month getMesDePercepcion() {
        return mesDePercepcion;
    }

}
