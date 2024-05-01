package ar.edu.unlp.info.oo2.OO2_ej9_excursiones;

public class Completa extends Estado {
	
	public void inscribir (Excursion e ,Usuario unUsuario) {
		e.addListaDeEspera(unUsuario);
	}
}