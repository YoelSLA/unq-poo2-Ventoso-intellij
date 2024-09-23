package main.tp5.factura;

import main.tp5.Agencia;
import main.tp5.Pagable;

public abstract class Factura implements Pagable {

    private Agencia agencia;

    public Agencia getAgencia() {
        return agencia;
    }

    public abstract double getPrecio();

    @Override
    public void procesarPago() {
        agencia.registrarPago(this);
    }

}
