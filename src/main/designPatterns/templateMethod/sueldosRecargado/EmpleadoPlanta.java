package main.designPatterns.templateMethod.sueldosRecargado;

class EmpleadoPlanta extends Empleado {

    private int cantidadHijos;

    EmpleadoPlanta(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    @Override
    double sueldoBruto() {
        return sueldoBasico() + cantidadHijos * 150;
    }

    private double sueldoBasico() {
        return 3000d;
    }
}