package punto1;

public class p1a {
	
	public static void aFor (int a, int b) { 
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
/*		//Solo imprimo si a es mayor o igual que b, si no seria algo asi:
		if(a <= b){
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		}else {
			for (int i = a; i >= b; i--) {
				System.out.println(i);
			}
		}
*/
	} 
	public static void bWhile (int a, int b) {
		while (a <= b) {
			System.out.println(a);
			a++;
		}
	}
	public static void cSinIteraRecursiva (int a, int b) { 
		System.out.println(a);
		if (a < b) {
			a++;
			cSinIteraRecursiva(a,b);
		}
	} 	

	public static void main(String[] args) {
		System.out.println("Imprimo con For:");
		aFor(1,1);
		System.out.println("Imprimo con While:");
		bWhile(1,2);
		System.out.println("Imprimo sin Iteraciones:");
		cSinIteraRecursiva(1,3);
	}
}
