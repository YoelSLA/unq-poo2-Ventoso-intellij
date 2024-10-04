package main.designPatterns.templateMethod.llamadasTelefonicas;

public abstract class LlamadaTelefonica {
    private int tiempo;
    private int horaDelDia;

    public LlamadaTelefonica(int tiempo, int horaDelDia) {
        this.tiempo = tiempo;
        this.horaDelDia = horaDelDia;
    }

    public int getTiempo() {
        return this.tiempo;
    } // concrete operation

    public int getHoraDelDia() {
        return this.horaDelDia;
    }

    public abstract boolean esHoraPico(); // primitive operation

    public float costoFinal() {
        if (this.esHoraPico()) {
            return this.costoNeto() * 1.2f * this.getTiempo();
        } else {
            return this.costoNeto() * this.getTiempo();
        }
    } // templed method

    public float costoNeto() {
        return this.getTiempo();
    } // concrete operation
}