package ar.edu.unlp.info.oo2.OO2_ej19b_personajes;

import java.util.ArrayList;
import java.util.List;

public class ThoorCreator extends Creator {
	
	@Override
	public Personaje crear() {
		List<String> habilidades = new ArrayList<>();
		habilidades.add("lanzar rayos");
		habilidades.add("combate a distancia");
		return new Personaje("thoor", new ArmaduraDeHierro(), new ArmaMartillo(), habilidades);
	}
	
}
