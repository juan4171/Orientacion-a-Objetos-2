package ar.edu.unlp.info.oo2.OO2_ej9_excursiones;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {

	private String nombre;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private Estado estado;
	private List<Usuario> inscripciones;
	private List<Usuario> listaDeEspera;
	
	public Excursion(String nombre, LocalDateTime fechaInicio, LocalDateTime fechaFin, String puntoDeEncuentro,
			double costo, int cupoMinimo, int cupoMaximo) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.estado = new Provisoria();
		this.inscripciones = new ArrayList<>();
		this.listaDeEspera = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}
	
	public double getCosto() {
		return this.costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}
	
	public Estado getEstado() {
		return this.estado;
	}

	public List<Usuario> getInscripciones() {
		return inscripciones;
	}

	public List<Usuario> getListaDeEspera() {
		return listaDeEspera;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void addInscripcion(Usuario inscripcion) {
		this.inscripciones.add(inscripcion);
	}

	public void addListaDeEspera(Usuario inscripcion) {
		this.listaDeEspera.add(inscripcion);
	}
	
	public boolean alcanzoMinimo() {
		return this.inscripciones.size() >= this.cupoMinimo;
	}
	
	public boolean alcanzoMaximo() {
		return this.inscripciones.size() >= this.cupoMaximo;
	}
	
	public void inscribir (Usuario unUsuario) {
		this.estado.inscribir(this, unUsuario);
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion(this);
	}

	public String getMailsInscriptos() {
		return this.getInscripciones().stream()
				.map(u -> u.getEmail())
				.collect(Collectors.joining(", "));
//		otras opciones para pasar de lista a string:
//				.collect(Collectors.joining("\n"));
//				.collect(Collectors.joining("\n", "", "."));
//				.reduce("", (acumulatorStr,u) -> acumulatorStr+"\n"+u);
	}
}

