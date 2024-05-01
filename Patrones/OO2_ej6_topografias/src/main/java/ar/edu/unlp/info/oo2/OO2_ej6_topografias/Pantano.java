package ar.edu.unlp.info.oo2.OO2_ej6_topografias;

public class Pantano extends Topografia{

	public double proporcionAgua() {
		return 0.7;
	}
	@Override
	public boolean igual(Topografia t) {
		return t.igualPantano();
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
		return false;
	}
	
	@Override
	public boolean igualPantano() {
		return true;
	}
	

}
