package ar.edu.unlp.info.oo2.OO2_ej9_excursiones;

public class Definitiva extends Estado {
	
	public void inscribir (Excursion e ,Usuario unUsuario) {
		e.addInscripcion(unUsuario);
		if (e.alcanzoMaximo()) {
			e.setEstado(new Completa());
		}
	}
	
	public String obtenerInformacion(Excursion e) {
		return super.obtenerInformacion(e) + 
				"\nActualmente faltan " + (e.getCupoMaximo() - e.getInscripciones().size())
				+ " personas para alcanzar el cupo maximo"
				+ ".\nA continuacion se listaran los mails de los usuarios inscriptos: " + e.getMailsInscriptos();
	}
	
}