package main.solid.sinSolid;

import java.util.List;

public interface IServidor {

    List<Correo> recibirNuevos(String user, String pass);

    void conectar(String nombreUsuario, String passusuario);

    void enviar(Correo correo);

    float tazaDeTransferencia();

    void resetear();

    void realizarBackUp();

}

