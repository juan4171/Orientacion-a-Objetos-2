package ar.edu.unlp.info.oo2.OO2_ej4_sueldos;

public class Planta extends Empleado{
	
	//TODO casado e hijos esta en  planta y temporario, que hacer? lo paso a empleado o hago una interfaz?
	private boolean casado;
	private int hijos;
	private int antiguedad;
	
	public Planta(boolean casado, int hijos, int antiguedad) {
		super();
		this.casado = casado;
		this.hijos = hijos;
		this.antiguedad = antiguedad;
	}

	public double basico() {
		return (50000);
	}
	
	public double adicional() {
		if (this.casado) {
			return 5000 + (this.hijos * 2000) + (this.antiguedad * 2000);
		}
		return (this.hijos * 2000);
	}
	
}
