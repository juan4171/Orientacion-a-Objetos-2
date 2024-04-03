package ar.edu.unlp.info.oo2.OO2_ej2_PPT;

public class Papel extends Jugada{
	
	@Override
	public String jugarContra(Jugada j) {
		return j.contraPapel();
	}

	@Override
	public String contraPiedra() {
		return "Papel cubre piedra";
	}

	@Override
	public String contraPapel() {
		return "Papel empata con papel";
	}

	@Override
	public String contraTijera() {
		return "Tijera corta papel";
	}
	
	@Override
	public String contraLagarto() {
		return "Lagarto come papel";
	}

	@Override
	public String contraSpock() {
		return "Papel desaprueba Spock";
	}
}
