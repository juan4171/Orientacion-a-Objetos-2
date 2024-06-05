package ar.edu.unlp.info.oo2.OO2_ej19b_personajes;

public class ArmaduraDeAcero implements Armadura {

	@Override
	public int recibirDañoEspada() {
		return 3;
	}

	@Override
	public int recibirDañoArco() {
		return 2;
	}

	@Override
	public int recibirDañoBaston() {
		return 1;
	}
	
	@Override
	public int recibirDañoMartillo() {
		return 10;
	}

}
