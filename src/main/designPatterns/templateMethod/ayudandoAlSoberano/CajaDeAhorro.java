package main.designPatterns.templateMethod.ayudandoAlSoberano;

public class CajaDeAhorro extends CuentaBancaria {
    private int limite;

    public CajaDeAhorro(String titular, int limite) {
        super(titular);
        this.limite = limite;
    }

    public int getLimite() {
        return this.limite;
    }

    @Override
    public boolean validar(int monto) {
        return this.getSaldo() >= monto && this.getLimite() >= monto;
    }
}