package ar.edu.unlp.info.oo2.OO2_ej9_excursiones;

public abstract class Estado {
	
	public abstract void inscribir (Excursion e ,Usuario unUsuario);
	
	public String obtenerInformacion(Excursion e) {
		return "La excursion '" + e.getNombre()
				+ "' tiene un costo de " + e.getCosto()
				+ " con fecha de inicio " + e.getFechaInicio().toString()
				+ " y fecha de fin " + e.getFechaFin().toString()
				+ ".\nEl punto de encuentro es en '" + e.getPuntoDeEncuentro();
	}
	
}
