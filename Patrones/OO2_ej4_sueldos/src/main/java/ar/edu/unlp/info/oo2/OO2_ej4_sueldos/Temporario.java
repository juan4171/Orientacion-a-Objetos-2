package ar.edu.unlp.info.oo2.OO2_ej4_sueldos;

public class Temporario extends Empleado{

	//TODO casado e hijos esta en  planta y temporario, que hacer? lo paso a empleado o hago una interfaz?
	private boolean casado;
	private int hijos;
	private double horas;
	
	public Temporario(boolean casado, int hijos, double horas) {
		super();
		this.casado = casado;
		this.hijos = hijos;
		this.horas = horas;
	}

	public double basico() {
		return (20000 + this.horas * 300);
	}
	
	public double adicional() {
		if (this.casado) {
			return 5000 + (this.hijos * 2000);
		}
		return (this.hijos * 2000);
	}
	
}
