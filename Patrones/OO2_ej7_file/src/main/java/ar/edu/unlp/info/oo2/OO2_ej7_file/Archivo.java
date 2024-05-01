package ar.edu.unlp.info.oo2.OO2_ej7_file;

import java.util.ArrayList;
import java.util.List;

public class Archivo extends FileSystem{
	
	private int tamano;
	
	public Archivo(String nombre, int tamano) {
		super(nombre);
		this.tamano= tamano;
	}

	@Override
	public int tamanoTotalOcupado() {
		return this.tamano;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	@Override
	public FileSystem buscar(String nombre) {
		return this;
	}

	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> laux = new ArrayList<FileSystem>();
		laux.add(this);
		return laux;
	}

	@Override
	public String listadoDeContenido(String parent) {
        return parent + "/" + this.getNombre() + "\n";
    }
//  NO ENCONTRE FORMA DE HACERLO SIN (String parent)
	
}
