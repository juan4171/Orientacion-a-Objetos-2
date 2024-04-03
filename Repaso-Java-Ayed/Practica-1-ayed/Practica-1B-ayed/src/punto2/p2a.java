package punto2;
import java.util.Scanner; 

public class p2a {
	public static int[] arregloDeMultiplos (int x) {
		int[] arreglo = new int[x];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i]= x * (i+1);
		}
		return arreglo;
	}
	public static void main(String[] args) {
		int num = -1;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Ingrese un numero MAYOR que 0: ");
			num = scan.nextInt();
		} while (num < 1); 
		//el numero no puede ser negativo porque no puedo crear un arreglo de tamaño negativo y mayor que 1 porque lo dice el enunciado
		scan.close();
		
		int[] a = arregloDeMultiplos(num); 
		System.out.println(num + " primeros multiplos del numero " + num + ":");
		for (int i : a) {		//for each
			System.out.println(i);
		}
	}
}