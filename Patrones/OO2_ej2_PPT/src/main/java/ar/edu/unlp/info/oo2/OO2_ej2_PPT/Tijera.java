package ar.edu.unlp.info.oo2.OO2_ej2_PPT;

public class Tijera extends Jugada{
	
	@Override
	public String jugarContra(Jugada j) {
		return j.contraTijera();
	}

	@Override
	public String contraPiedra() {
		return "Piedra aplasta tijera";
	}

	@Override
	public String contraPapel() {
		return "Tijera corta papel";
	}

	@Override
	public String contraTijera() {
		return "Tijera empata con tijera";
	}
	
	@Override
	public String contraLagarto() {
		return "Tijera decapita lagarto";
	}

	@Override
	public String contraSpock() {
		return "Spock rompe tijera";
	}
}
