package main.designPatterns.templateMethod.ayudandoAlSoberano;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
    private String titular;
    private int saldo;
    private List<String> movimientos;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    public String getTitular() {
        return this.titular;
    }

    public int getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(int monto) {
        this.saldo = monto;
    } // concrete operation

    public void agregarMovimientos(String movimiento) {
        this.movimientos.add(movimiento);
    } // concrete operation

    public final void extraer(int monto) {
        if (this.validar(monto)) {
            this.setSaldo(this.getSaldo() - monto);
            this.agregarMovimientos("Extraccion");
        }
    } // templed method

    public abstract boolean validar(int monto); // primitive operation

    public List<String> getMovimientos() {
        return movimientos;
    }
}
