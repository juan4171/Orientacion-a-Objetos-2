package ar.edu.unlp.info.oo2.OO2_ej19_personajes;

public class ArmaArco implements Arma {
	@Override
	public int calcularDaño(Armadura armadura) {
		return armadura.recibirDañoArco();
	}
}
