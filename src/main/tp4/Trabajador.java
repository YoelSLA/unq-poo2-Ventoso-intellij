package main.tp4;

import main.tp4.ingreso.Ingreso;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

    private List<Ingreso> ingresos;

    public Trabajador() {
        this.ingresos = new ArrayList<>();
    }

    public void agregarIngreso(Ingreso income) {
        ingresos.add(income);
    }

    public double getTotalPercibido() {
        return ingresos.stream().mapToDouble(Ingreso::getMonto).sum();
    }

    public double getMontoImponible() {
        return ingresos.stream().mapToDouble(Ingreso::getMontoImponible).sum();
    }

    public double getImpuestoAPagar() {
        return getMontoImponible() * 0.02;
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

}
