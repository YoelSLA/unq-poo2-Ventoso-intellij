package main.designPatterns.adapter.palabrasOrdenadas;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(DefaultListModel<String> listModel) {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setBounds(new Rectangle(180, 180));
        this.setVisible(true);
        JLabel label = new JLabel("Lista de palabras");
        label.setBounds(new Rectangle(40, 40));
        this.add(label);
        listModel.addElement("casa");
        listModel.addElement("arbol");
        listModel.addElement("perro");
        listModel.addElement("telefono");
        listModel.addElement("brazo");
        JList<String> lista = new JList<>(listModel);
        lista.setBounds(new Rectangle(110, 160));
        this.add(lista);
    }

    public static void main(String[] args) {
        // new Ventana(new DefaultListModel<>()); /*esta línea puede modificarse luego de resolver el ejercicio.*/
        new Ventana(new ListaDePalabrasOrdenadasAdapter());
    }
}