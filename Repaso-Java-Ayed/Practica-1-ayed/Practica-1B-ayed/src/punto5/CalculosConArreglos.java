package punto5;

public class CalculosConArreglos {
	
	//PUNTO A, retorno lo pedido a travez del return del metodo statico
	public static int[] maxMinProm(int[] datos) {
		int max = datos[0], min = datos[0], prom = datos[0];
		for (int i = 1; i < datos.length; i++) {
			if (datos[i] > max)
				max = datos[i];
			if (datos[i] < min)
				min = datos[i];
			prom=prom+datos[i];
		}
		prom=prom/datos.length;
		int[] valores = {max,min,prom};
		return valores;
	}
	
	//PUNTO B, retorno lo pedido interactuando con un objeto tipo Numero pasado por parametro a un metodo statico
	//para asi almacenar en su interior los valores requeridos, ya que el parametro es una referencia a un objeto	
	public static void maxMinPromPorParametro (SuperArreglo x) {
		int[] datos=x.getArreglo();
		int[] maxMinProm= maxMinProm(datos);
		x.setMax(maxMinProm[0]);
		x.setMin(maxMinProm[1]);
		x.setProm(maxMinProm[2]);
	}

	//PUNTO C, preguntar en clase: con una variables static 
	private static int[] arrayStatic = {1, 2, 3, 4, 5};
	private static int[] maxMinPromStatic;
	
	public static void maxMinPromArregloStatic() {
		maxMinPromStatic= maxMinProm(arrayStatic);
	}
	
	
	public static void main(String[] args) {
		//formo arreglo:
		int[] array = {1, 2, 3, 4, 5};
		for (int i : array) {
			System.out.print(i+" ");
		}

		//PUNTO A, retorno lo pedido a travez del return del metodo statico
		int[] a = maxMinProm(array);
		System.out.println("\nPunto A:\nEl Máximo es " + a[0]+"\nEl Minimo es " + a[1]+"\nEl Promedio es " + a[2]);
		
		//PUNTO B, retorno lo pedido interactuando con un objeto tipo Numero pasado por parametro a un metodo statico
		//para asi almacenar en su interior los valores requeridos, ya que el parametro es una referencia a un objeto
		SuperArreglo b = new SuperArreglo(array);
		maxMinPromPorParametro(b);
		System.out.println("\nPunto B:\nEl Máximo es " + b.getMax()+"\nEl Minimo es " + b.getMin()+"\nEl Promedio es " + b.getProm());

		//PUNTO C, preguntar en clase: con una variables static 
		maxMinPromArregloStatic();
		System.out.println("\nPunto C:\nEl Máximo es " + maxMinPromStatic[0]+"\nEl Minimo es " + maxMinPromStatic[1]+"\nEl Promedio es " + maxMinPromStatic[2]);
	}
}
