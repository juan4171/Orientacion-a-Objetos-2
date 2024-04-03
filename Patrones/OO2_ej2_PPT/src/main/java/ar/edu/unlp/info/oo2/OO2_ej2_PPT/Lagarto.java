package ar.edu.unlp.info.oo2.OO2_ej2_PPT;

public class Lagarto extends Jugada{
	
	@Override
	public String jugarContra(Jugada j) {
		return j.contraLagarto();
	}

	@Override
	public String contraPiedra() {
		return "Piedra aplasta lagarto";
	}

	@Override
	public String contraPapel() {
		return "Lagarto come papel";
	}

	@Override
	public String contraTijera() {
		return "Tijera decapita lagarto";
	} 
	
	public String contraLagarto() {
		return "Lagarto empata con lagarto";
	}
	
	public String contraSpock() {
		return "Lagarto envenena Spock";
	}

}
