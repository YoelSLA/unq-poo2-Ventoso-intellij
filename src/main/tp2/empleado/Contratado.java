package main.tp2.empleado;

import main.tp2.Concepto;
import main.tp2.EstadoCivil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contratado extends Empleado {

    private int nroContrato;
    private String medioDePago;

    public Contratado(String nombre, String direccion, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
                      double sueldoBasico, int nroContrato, String medioDePago) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.nroContrato = nroContrato;
        this.medioDePago = medioDePago;
    }

    @Override
    public double sueldoBruto() {
        return this.getSueldoBasico();
    }

    @Override
    public double retenciones() {
        return 50;
    }

    @Override
    public List<Concepto> conceptos() {
        List<Concepto> conceptos = new ArrayList<>();;
        conceptos.add(new Concepto("Sueldo Basico", this.getSueldoBasico()));
        conceptos.add(new Concepto("Gastos Administrativos Contractuales", 50.0));
        return conceptos;
    }

    public int getNroContrato() {
        return nroContrato;
    }

    public String getMedioDePago() {
        return medioDePago;
    }






}