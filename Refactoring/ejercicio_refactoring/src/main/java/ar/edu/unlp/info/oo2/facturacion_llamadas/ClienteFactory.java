package ar.edu.unlp.info.oo2.facturacion_llamadas;
public class ClienteFactory{
	public static Cliente crearCliente(String tipo, String nombre, String numeroTelefono, String data){
		switch(tipo){
			case "fisica":
				return new ClientePersonaFisica(nombre, numeroTelefono, data);
			case "juridica":
				return new ClientePersonaJuridica(nombre, numeroTelefono, data);			
			default:
				throw new IllegalArgumentException("Tipo de cliente no válido");
		}		
	}
}