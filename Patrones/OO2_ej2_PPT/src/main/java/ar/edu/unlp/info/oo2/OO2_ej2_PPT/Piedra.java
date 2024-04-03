package ar.edu.unlp.info.oo2.OO2_ej2_PPT;

public class Piedra extends Jugada{
	
	@Override
	public String jugarContra(Jugada j) {
		return j.contraPiedra();
	}

	@Override
	public String contraPiedra() {
		return "Piedra empata con piedra";
	}

	@Override
	public String contraPapel() {
		return "Papel cubre piedra";
	}

	@Override
	public String contraTijera() {
		return "Piedra aplasta tijera";
	}
	
	@Override
	public String contraLagarto() {
		return "Piedra aplasta lagarto";
	}

	@Override
	public String contraSpock() {
		return "Spock vaporiza piedra";
	}
}
