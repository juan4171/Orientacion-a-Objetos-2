package ar.edu.unlp.info.oo2.OO2_ej19_personajes;

import java.util.ArrayList;
import java.util.List;

public class GuerreroCreator extends Creator {
	
	@Override
	public Personaje crear() {
		List<String> habilidades = new ArrayList<>();
		habilidades.add("combate cuerpo a cuerpo");
		return new Personaje("guerrero", new ArmaduraDeAcero(), new ArmaEspada(), habilidades);
	}
	
}
