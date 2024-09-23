package main.tp4.ingreso;

import java.time.Month;

public class HorasExtras extends Ingreso {

    private int horasExtras;

    public HorasExtras(double monto, String concepto, Month mesDePercepcion, int horasExtras) {
        super(monto, concepto, mesDePercepcion);
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double getMontoImponible() {
        return 0d;
    }
}
