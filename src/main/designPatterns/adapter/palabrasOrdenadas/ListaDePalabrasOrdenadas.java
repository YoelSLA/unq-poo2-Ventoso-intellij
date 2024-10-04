package main.designPatterns.adapter.palabrasOrdenadas;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListaDePalabrasOrdenadas {

    private List<String> palabras;
    private final Comparator<String> comparador;

    public ListaDePalabrasOrdenadas() {
        this.palabras = new LinkedList<>();
        this.comparador = String::compareToIgnoreCase;
    }

    public void agregarPalabra(String palabra) {
        this.palabras.add(palabra);
        this.palabras.sort(this.comparador);
    }

    public Integer cantidadDePalabras() {
        return this.palabras.size();
    }

    public String getPalabraDePosicion(int posicion) {
        return this.palabras.get(posicion);
    }
}