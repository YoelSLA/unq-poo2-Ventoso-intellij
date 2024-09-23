package main.streamsYenums;

import java.time.LocalTime;


public class ActividadSemanal {

    private DiaDeLaSemana dia;
    private LocalTime horaInicio;
    private int duracion; // en horas
    private Deporte deporte;

    public ActividadSemanal(DiaDeLaSemana dia, LocalTime horaInicio, int duracion, Deporte deporte) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.deporte = deporte;
    }

    public int getCosto() {
        int costoBase = 0;

        if (dia.ordinal() <= DiaDeLaSemana.MIERCOLES.ordinal()) {
            costoBase = 500;
        } else {
            costoBase = 1000;
        }

        return costoBase + (deporte.getComplejidad() * 200);
    }

    public DiaDeLaSemana getDia() {
        return dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    @Override
    public String toString() {
        return "Deporte: " + deporte + ". Dia: " + dia + " A LAS: " + horaInicio + ". Duración: " + duracion + " hora(s).";
    }
}

