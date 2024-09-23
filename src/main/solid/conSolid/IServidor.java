package main.solid.conSolid;

public interface IServidor {

    void recibirNuevos(String user, String pass);

    void conectar(String nombreUsuario, String passusuario);

    void enviar(Correo correo);
}
