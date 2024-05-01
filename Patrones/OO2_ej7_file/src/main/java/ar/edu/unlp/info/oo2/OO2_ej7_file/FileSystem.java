package ar.edu.unlp.info.oo2.OO2_ej7_file;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystem {
	
	private String nombre;
	private LocalDate fechaDeCreacion;

    public FileSystem(String nombre) {
		super();
		this.nombre = nombre;
		this.fechaDeCreacion = LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract FileSystem buscar(String nombre);
	public abstract List<FileSystem> buscarTodos(String nombre);
	public abstract String listadoDeContenido(String parent);
}

