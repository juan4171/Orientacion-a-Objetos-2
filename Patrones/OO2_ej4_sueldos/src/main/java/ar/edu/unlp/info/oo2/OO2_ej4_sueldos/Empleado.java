package ar.edu.unlp.info.oo2.OO2_ej4_sueldos;

public abstract class Empleado {
	
	public double sueldo() {
		return this.basico() + this.adicional() - this.descuento();
	}
	
	public abstract double basico();
	
	public abstract double adicional();
	
	public double descuento() {
		return this.basico()*0.13 + this.adicional()*0.05;
	}

}
