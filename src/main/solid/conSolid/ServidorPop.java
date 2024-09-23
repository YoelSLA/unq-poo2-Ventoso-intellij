package main.solid.conSolid;

public class ServidorPop implements IServidor, IServidorAdministrable {

    public void recibirNuevos(String user, String pass) {
        //Verificar autenticidad de usuario.
        //obtener emails Nuevos del usuario.
        //asignar a retorno la lista de los nuevos e-mails.
    }

    public void conectar(String nombreUsuario, String passusuario) {
        //Verifica que el usuario sea valido y establece la conexion.
    }

    public void enviar(Correo correo) {
        //realiza lo necesario para enviar el correo.
    }

    @Override
    public float tazaDeTransferencia() {
        //no corresponde
        return 0;
    }

    @Override
    public void resetear() {
        //no corresponde
    }

    @Override
    public void realizarBackUp() {
        //no corresponde

    }

}
