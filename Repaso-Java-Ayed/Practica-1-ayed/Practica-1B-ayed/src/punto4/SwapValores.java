package punto4;

public class SwapValores { 
	public static void swap1 (int x, int y) { 
		if (x < y) { 
			int tmp = x ; 
			x = y ; 
			y = tmp; 
		} //Cuando Java llama a un método, hace una copia de sus parámetros reales y envía las copias 
		//al método. Cuando el método finaliza, esas copias se descartan y los valores de las 
		//variables en el código principal son los mismos que antes.
	 } 
	public static void swap2 (Integer x, Integer y) { 
		if (x < y) { 
			int tmp = x ; 
			x = y ; 
			y = tmp; 
		} //Las clases wrapper (Integer, Character, Double ..) y las instancias de String son inmutables
	} 
	public static void main(String[] args) { 
		int a = 1, b = 2; 
		Integer c = 3, d = 4; 
		swap1(a,b); 
		swap2(c,d); 
		System.out.println("a=" + a + " b=" + b) ; 
		System.out.println("c=" + c + " d=" + d) ; 
	} 
}