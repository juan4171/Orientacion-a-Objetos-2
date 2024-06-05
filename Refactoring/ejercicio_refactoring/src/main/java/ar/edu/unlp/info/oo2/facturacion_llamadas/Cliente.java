package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private List<Llamada> llamadas = new ArrayList<Llamada>();	
	private String nombre;
	private String numeroTelefono;

	public Cliente(String nombre, String numeroTelefono) {
		this.nombre = nombre; 
		this.numeroTelefono = numeroTelefono;
	}

	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
	public String getNombre() {
		return nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public abstract double getDescuento();

	private double computarMontoLlamada(Llamada llamada) {
        return llamada.calcularMontoLlamada() * ( 1 - this.getDescuento());
    }

	public double calcularMontoTotalLlamadas() {
        return this.llamadas
                .stream()
                .mapToDouble(llamada -> this.computarMontoLlamada(llamada))
                .sum();
    }

}
