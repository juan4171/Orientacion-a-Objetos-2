package punto3;

public class Test {

	public static void main(String[] args) {
		int cantEst = 2;
		int cantProf = 3;
		Estudiante[] arregloE= new Estudiante[cantEst];
		Profesor[] arregloP= new Profesor[cantProf];
		
		//no uso constructories porque el enunciado dice:
		//"Recuerde asignar los valores de los atributos de los objetos Estudiante y Profesor invocando los respectivos métodos setters"
		for (int i = 0; i < arregloE.length; i++) {
			Estudiante estudianteAux= new Estudiante(); 
			estudianteAux.setNombre("cosme "+i);
			estudianteAux.setApellido("fulanito "+i);
			estudianteAux.setComision("mañana");
			estudianteAux.setEmail("fulanoMail"+i);
			estudianteAux.setDireccion("calle "+i);
			arregloE[i]=estudianteAux;
		}
		for (Estudiante e : arregloE) {
			System.out.println(e.tusDatos());
			
		}
		for (int i = 0; i < arregloP.length; i++) {
			Profesor profesorAux = new Profesor();
			profesorAux.setNombre("cosme "+i);
			profesorAux.setApellido("fulanito "+i);
			profesorAux.setEmail("fulanoMail"+i);
			profesorAux.setCatedra("materia "+i);
			profesorAux.setFacultad("universidad "+i);
			arregloP[i]=profesorAux;
		}
		for (Profesor p : arregloP) {
			System.out.println(p.tusDatos());
		}
		
	}
	
}
