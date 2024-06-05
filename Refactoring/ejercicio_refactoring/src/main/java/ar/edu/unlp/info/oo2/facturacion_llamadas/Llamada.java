package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {	
	private String origen;
	private String destino;
	private int duracion;
	private static final double PORCENTAJE_IVA = 0.21;

	public Llamada(String origen, String destino, int duracion) { // quitamos el tipo de llamada		
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
	}


	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}

	public abstract double getPrecioSegundo();

	public double getAdicional(){
		return 0;
	};

	public double calcularMontoLlamada() {		
        return ((this.duracion * this.getPrecioSegundo()) + ((this.duracion * this.getPrecioSegundo()) * PORCENTAJE_IVA)) + this.getAdicional();		
    }

}


