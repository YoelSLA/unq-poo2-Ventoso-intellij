package main.designPatterns.templateMethod.sueldosRecargado;

class EmpleadoTemporario extends Empleado {

    private int cantidadHorasTrabajadas;
    private boolean tieneHijos;
    private boolean tieneConyuge;

    public EmpleadoTemporario(boolean tieneConyuge, int cantidadHorasTrabajadas, boolean tieneHijos) {
        this.tieneConyuge = tieneConyuge;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.tieneHijos = tieneHijos;
    }

    @Override
    double sueldoBruto() {
        return sueldoBasico() + bonoFamiliar() + cantidadHorasTrabajadas * 5;
    }

    private double sueldoBasico() {
        return 1000d;
    }

    private double bonoFamiliar() {
        return (tieneHijos || tieneConyuge) ? 1000d : 0 ;
    }
}