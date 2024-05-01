package ar.edu.unlp.info.oo2.OO2_ej6_topografias;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia{

	private List<Topografia> pixeles = new ArrayList<Topografia>(4);

	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		super();
		pixeles.add(t1);
		pixeles.add(t2);
		pixeles.add(t3);
		pixeles.add(t4);
	}
	
	public double proporcionAgua() { 
//		double proporcionAux = 0;
//		for (Topografia topografia : pixeles) {
//			proporcionAux= proporcionAux + topografia.proporcionAgua();
//		}
//		return proporcionAux/4;
		//usando streams:
		return this.pixeles.stream()
				.mapToDouble(pixel -> pixel.proporcionAgua())
				.sum() / 4;
	}
	
	
	public List<Topografia> getHijos() {
		return pixeles;
	}

	@Override
	public boolean igual(Topografia t) {
		return t.igualMixta(this);
	}

	@Override
	public boolean igualAgua() {
		return false;
	}

	@Override
	public boolean igualTierra() {
		return false;
	}

	@Override
	public boolean igualMixta(Mixta m) {
		return m.getHijos().equals(this.getHijos());
	}

	@Override
	public boolean igualPantano() {
		return false;
	}

}
