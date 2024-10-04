package main.designPatterns.adapter.palabrasOrdenadas;

import javax.swing.*;

public class ListaDePalabrasOrdenadasAdapter  extends DefaultListModel<String> {

    private ListaDePalabrasOrdenadas listaDePalabrasOrdenadas;

    public ListaDePalabrasOrdenadasAdapter() {
        this.listaDePalabrasOrdenadas = new ListaDePalabrasOrdenadas();
    }

    @Override
    public void addElement(String palabra) {
        listaDePalabrasOrdenadas.agregarPalabra(palabra);
    }

    @Override
    public String getElementAt(int index) {
        return listaDePalabrasOrdenadas.getPalabraDePosicion(index);
    }

    @Override
    public int getSize() {
        return listaDePalabrasOrdenadas.cantidadDePalabras();
    }
}