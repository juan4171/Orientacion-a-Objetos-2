package punto5;

public class SuperArreglo {
	private int[] arreglo;
	private int max;
	private int min;
	private int prom;

	public SuperArreglo(int[] array) {
		this.setArreglo(array);
	}
	
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getProm() {
		return prom;
	}

	public void setProm(int prom) {
		this.prom = prom;
	}

	public int[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(int[] arreglo) {
		this.arreglo = arreglo;
	}
	
}
