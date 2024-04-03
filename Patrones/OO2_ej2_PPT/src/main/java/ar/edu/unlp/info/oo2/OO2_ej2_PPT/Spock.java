package ar.edu.unlp.info.oo2.OO2_ej2_PPT;

public class Spock extends Jugada{
	
	@Override
	public String jugarContra(Jugada j) {
		return j.contraSpock();
	}

	@Override
	public String contraPiedra() {
		return "Spock vaporiza piedra";
	}

	@Override
	public String contraPapel() {
		return "Papel desaprueba Spock";
	}

	@Override
	public String contraTijera() {
		return "Spock rompe tijera";
	}

	@Override
	public String contraLagarto() {
		return "Lagarto envenena Spock";
	}

	@Override
	public String contraSpock() {
		return "Spock empata con spock";
	}

}
