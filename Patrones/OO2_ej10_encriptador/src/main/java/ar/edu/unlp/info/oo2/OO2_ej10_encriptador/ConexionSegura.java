package ar.edu.unlp.info.oo2.OO2_ej10_encriptador;

public abstract class ConexionSegura extends Conexion{
	
	private Encriptador encriptador;
	
//	RSA encriptacion default
	public ConexionSegura() {
		super();
		this.encriptador = new RSA();
	}
//	le puedo pasar una encriptacion cuando lo creo
	public ConexionSegura(Encriptador encriptador) {
		super();
		this.encriptador = encriptador;
	}
//	le puedo cambiar la encriptacion en ejecucion
	public void setEncriptador(Encriptador encriptador) {
		this.encriptador = encriptador;
	}
	
	public void enviar(String mensaje) {
		String mensajeEncriptado = this.encriptador.encriptar(mensaje);
		super.enviar(mensajeEncriptado);
	}
}
