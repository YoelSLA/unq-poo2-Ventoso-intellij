package main.solid.conSolid;

import main.solid.sinSolid.Correo;

import java.util.ArrayList;

public class BandejaEntrada {

    private ArrayList<Correo> inbox;
    private ArrayList<Correo> borrados;

    public void borrarCorreo(Correo correo) {
        this.inbox.remove(correo);
        this.borrados.remove(correo);
    }

    public int contarBorrados() {
        return this.borrados.size();
    }

    public int contarInbox() {
        return this.inbox.size();
    }

    public void eliminarBorrado(Correo correo) {
        this.borrados.remove(correo);
    }

}
