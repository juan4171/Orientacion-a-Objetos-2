package ar.edu.unlp.info.oo2.OO2_ej6_topografias;

public abstract class Topografia {

	public abstract double proporcionAgua();
	
	public double proporcionTierra() {
		return (1 - this.proporcionAgua());
	}

	public abstract boolean igual(Topografia t);
	public abstract boolean igualAgua();
	public abstract boolean igualTierra();
	public abstract boolean igualPantano();
	public abstract boolean igualMixta(Mixta m);
}
