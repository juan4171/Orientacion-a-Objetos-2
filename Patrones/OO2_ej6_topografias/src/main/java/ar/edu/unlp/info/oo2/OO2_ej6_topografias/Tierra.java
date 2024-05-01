package ar.edu.unlp.info.oo2.OO2_ej6_topografias;

public class Tierra extends Topografia{

	public double proporcionAgua() {
		return 0;
	}
	@Override
	public boolean igual(Topografia t) {
		return t.igualTierra();
	}

	@Override
	public boolean igualAgua() {
		return false;
	}

	@Override
	public boolean igualTierra() {
		return true;
	}

	@Override
	public boolean igualMixta(Mixta m) {
		return false;
	}
	@Override
	public boolean igualPantano() {
		return false;
	}
	

}
