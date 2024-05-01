package ar.edu.unlp.info.oo2.OO2_ej10_encriptador;

public class Mensajero {
	
	private Conexion conexion;
	
	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}
	
	public void enviar(String mensaje) {
		conexion.enviar(mensaje);
	}

}
