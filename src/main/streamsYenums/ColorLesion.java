package main.streamsYenums;

public enum ColorLesion {

    ROJO("Lesión en estado inicial", 3),
    GRIS("Lesión en estado intermedio", 2),
    AMARILLO("Lesión en proceso avanzado", 4),
    MIEL("Lesión en estado final", 1);

    private final String descripcion;
    private final int nivelRiesgo;

    ColorLesion(String descripcion, int nivelRiesgo) {
        this.descripcion = descripcion;
        this.nivelRiesgo = nivelRiesgo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNivelRiesgo() {
        return nivelRiesgo;
    }

    public ColorLesion getSiguienteColor() {
        switch (this) {
            case ROJO:
                return GRIS;
            case GRIS:
                return AMARILLO;
            case AMARILLO:
                return MIEL;
            case MIEL:
                return ROJO;
            default:
                throw new IllegalStateException("Color no válido");
        }
    }

}
