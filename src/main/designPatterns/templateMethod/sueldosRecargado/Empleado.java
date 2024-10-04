package main.designPatterns.templateMethod.sueldosRecargado;

abstract class Empleado {

    final double sueldo() {
        return sueldoBruto() - retenciones();
    }
    abstract double sueldoBruto();

    private double retenciones() {
        return 13d;
    }

}