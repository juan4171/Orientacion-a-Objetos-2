package ar.edu.unlp.info.oo2.OO2_ej6_topografias;

public class Agua extends Topografia{

	public double proporcionAgua() {
		return 1;
	}

	@Override
	public boolean igual(Topografia t) {
		return t.igualAgua();
	}

	@Override
	public boolean igualAgua() {
		return true;
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
		return false;
	}
}
