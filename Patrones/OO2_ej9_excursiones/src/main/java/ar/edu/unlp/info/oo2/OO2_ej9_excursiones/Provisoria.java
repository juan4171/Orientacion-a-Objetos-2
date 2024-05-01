package ar.edu.unlp.info.oo2.OO2_ej9_excursiones;

public class Provisoria extends Estado {
	
	public void inscribir (Excursion e ,Usuario unUsuario) {
		e.addInscripcion(unUsuario);
		if (e.alcanzoMinimo()) {
			e.setEstado(new Definitiva());
		}
	}
	
	public String obtenerInformacion(Excursion e) {
		return super.obtenerInformacion(e) + 
				"\nActualmente faltan " + (e.getCupoMinimo() - e.getInscripciones().size())
				+ " personas para alcanzar el cupo minimo.";
	}
	
}
