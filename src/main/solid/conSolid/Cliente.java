package main.solid.conSolid;

public class Cliente {

    private IServidor iServidor;
    private String nombreUsuario;
    private String passUsuario;
    private BandejaEntrada bandejaEntrada;

    public Cliente(ServidorPop servidor, String nombreUsuario, String pass) {
        this.iServidor = servidor;
        this.nombreUsuario = nombreUsuario;
        this.passUsuario = pass;
        this.bandejaEntrada = new BandejaEntrada();
        this.conectar();
    }

    public void conectar() {
        this.iServidor.conectar(this.nombreUsuario, this.passUsuario);
    }

    public void recibirNuevos() {
        this.iServidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
    }

    public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
        Correo correo = new Correo(asunto, destinatario, cuerpo);
        this.iServidor.enviar(correo);
    }

}
