package main.tp2.empleado;

import main.tp2.Concepto;
import main.tp2.EstadoCivil;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public abstract class Empleado {

    private String nombre, direccion;
    private EstadoCivil estadoCivil;
    private LocalDate fechaNacimiento;
    private double sueldoBasico;

    public Empleado(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
                    double sueldoBasico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBasico = sueldoBasico;
    }

    public abstract double sueldoBruto();

    public abstract double retenciones();

    public abstract List<Concepto> conceptos();

    public final double sueldoNeto() {
        return this.sueldoBruto() - this.retenciones();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public int edad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

}
