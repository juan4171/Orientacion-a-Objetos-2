package ar.edu.unlp.info.oo2.OO2_ej19_personajes;

import java.util.ArrayList;
import java.util.List;

public class MagoCreator extends Creator {
	
	@Override
	public Personaje crear() {
		List<String> habilidades = new ArrayList<>();
		habilidades.add("magia");
		habilidades.add("combate a distancia");
		return new Personaje("mago", new ArmaduraDeCuero(), new ArmaBaston(), habilidades);
	}
	
}
