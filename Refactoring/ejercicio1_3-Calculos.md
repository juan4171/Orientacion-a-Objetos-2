### 1.3 Cálculos 
Analice el código que se muestra a continuación. Indique qué code smells encuentra y cómo pueden corregirse.						

```java
public void imprimirValores() {
	int totalEdades = 0;
	double promedioEdades = 0;
	double totalSalarios = 0;
	
	for (Empleado empleado : personal) {
		totalEdades = totalEdades + empleado.getEdad();
		totalSalarios = totalSalarios + empleado.getSalario();
	}
	promedioEdades = totalEdades / personal.size();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
			
}
```

**Code smells:**
   1. Método largo: el método esta realizando multiples tareas (sumar las edades, sumar los salarios, calcular el promedio de edades e imprimir esos valores).   
   Mal olor en metodo **"imprimir valores()"**.
   Se podría solucionar creando distintos métodos que hagan cada una de esas cosas por separado, aplicandodo refactoring extract method.

*Solucion Codigo del refactoring aplicado*:

```java
public void imprimirValores() {
	double promedioEdades = calcularPromedioEdades();
	double totalSalarios = calcularTotalSalario();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
}
public double calcularPromedioEdades() {
	int totalEdades = 0;
	double promedioEdades = 0;
	
	for (Empleado empleado : personal) {
		totalEdades = totalEdades + empleado.getEdad();
	}
	promedioEdades = totalEdades / personal.size();
		
	return promedioEdades
}
public double calcularTotalSalario() {
	double totalSalarios = 0;
	
	for (Empleado empleado : personal) {
		totalSalarios = totalSalarios + empleado.getSalario();
	}
		
	return totalSalarios
}
```

**Code smells:**
   2. Reinvento la rueda: ya existen programadas funciones para sacar promedios y totales con .streams
   Mal olor en metodo los for de calcularTotalSalario() y calcularPromedioEdades().
   Se podría solucionar reemplazando fors por streams.

*Solucion Codigo del refactoring aplicado*:

```java
public void imprimirValores() {
	double promedioEdades = calcularPromedioEdades();
	double totalSalarios = calcularTotalSalario();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
}
public double calcularPromedioEdades() {	
	return personal.stream()
		.mapToint(e -> e.getEdad())
		.average();
}
public double calcularTotalSalario() {
	return personal.stream()
		.mapToDouble(e -<> e.getSalario())
		.sum();
}
```
**Code smells:**
   3. temporary fields: hay atributos que solo sirven para almacenar temporalmente 
   Mal olor las variables message, promiedioEdades y totalSalarios.
   Se podría solucionar removiendo esas variables.

*Solucion Codigo del refactoring aplicado*:

```java
public void imprimirValores() {
	System.out.println(String.format("El promedio de las edades es %s y el total de salarios es %s", calcularPromedioEdades(), calcularTotalSalario()));
}
public double calcularPromedioEdades() {	
	return personal.stream()
		.mapToint(e -> e.getEdad())
		.average();
}
public double calcularTotalSalario() {
	return personal.stream()
		.mapToDouble(e -<> e.getSalario())
		.sum();
}
```