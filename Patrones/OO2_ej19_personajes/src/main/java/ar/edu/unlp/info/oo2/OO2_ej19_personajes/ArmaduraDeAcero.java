package ar.edu.unlp.info.oo2.OO2_ej19_personajes;

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

}
