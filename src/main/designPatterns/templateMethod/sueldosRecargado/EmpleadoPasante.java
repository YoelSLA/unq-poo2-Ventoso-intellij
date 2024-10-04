package main.designPatterns.templateMethod.sueldosRecargado;

class EmpleadoPasante extends Empleado {

    private int cantidadHorasTrabajadas;

    EmpleadoPasante(int cantidadHorasTrabajadas) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

    @Override
    double sueldoBruto() {
        return cantidadHorasTrabajadas * 40;
    }
}