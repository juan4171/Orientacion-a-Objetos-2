package ar.edu.unlp.info.oo2.OO2_ej19b_personajes;

import java.util.ArrayList;
import java.util.List;

public class ArqueroCreator extends Creator {
	
	@Override
	public Personaje crear() {
		List<String> habilidades = new ArrayList<>();
		habilidades.add("combate a distancia");
		return new Personaje("arquero", new ArmaduraDeCuero(), new ArmaArco(), habilidades);
	}

}
