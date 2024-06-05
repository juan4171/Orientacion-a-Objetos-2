package ar.edu.unlp.info.oo2.OO2_ej19_personajes;

public class ArmaduraDeHierro implements Armadura {

	@Override
	public int recibirDañoEspada() {
		return 5;
	}

	@Override
	public int recibirDañoArco() {
		return 3;
	}

	@Override
	public int recibirDañoBaston() {
		return 1;
	}
}
