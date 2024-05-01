package ar.edu.unlp.info.oo2.OO2_ej7_file;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends FileSystem{

	private List<FileSystem> Elementos;
	private final int tamanoInicial = 32;
	
	public Directorio(String nombre) {
		super(nombre);
		Elementos = new ArrayList<FileSystem>();
	}
	
	public void agregarElemento(FileSystem e) {
		this.Elementos.add(e);
	}

	public List<FileSystem> getElementos() {
		return Elementos;
	}

	@Override
	public int tamanoTotalOcupado() {
		return this.getElementos().stream()
				.mapToInt(e -> e.tamanoTotalOcupado())
				.sum() + this.tamanoInicial;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this.getElementos().stream()
				.map(e -> e.archivoMasGrande())
				.max((e1, e2) ->Integer.compare(e1.tamanoTotalOcupado(), e2.tamanoTotalOcupado()))
				.orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this.getElementos().stream()
				.map(e -> e.archivoMasNuevo())
				.max((e1, e2) -> e1.getFechaDeCreacion().compareTo(e2.getFechaDeCreacion()))
				.orElse(null);
	}

	@Override
	public FileSystem buscar(String nombre) {
		if (this.getNombre() == nombre) {
			return this;
		}else {
			return this.getElementos().stream()
				.map(e -> e.buscar(nombre))
				.filter(e -> e != null)
				.filter(e -> e.getNombre() == nombre)
				.findFirst().orElse(null);
		}
	}
	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> laux = new ArrayList<FileSystem>();
		laux.add(this);
		for (FileSystem e : this.getElementos()) {
			laux.addAll(e.buscarTodos(nombre));
		}
		return laux.stream()
					.filter(e -> e.getNombre() == nombre)
					.collect(Collectors.toList());
		}
	//como funciona este choclo de codigo que no puede convertir a 1 stream:
	//agrego todos los hijos de directorio a una lista aux, despues filtro
	//los hijos que me interesan y los retorno en una lista que puede tener
	//los elementos buscados o estar vacia si no encontre elementos.

	@Override
    public String listadoDeContenido(String parent) {
        String currentPath = parent + "/" + this.getNombre();
        StringBuilder str = new StringBuilder(currentPath + "\n");
        this.getElementos().forEach(fs -> str.append(fs.listadoDeContenido(currentPath)));
        return str.toString();
//      NO ENCONTRE FORMA DE HACERLO SIN (String parent)
//    	diferencia entre StringBuilder y String es que StringBuilder es 
//    	mutable, lo que significa que puedes cambiar su contenido sin 
//    	tener que crear un nuevo objeto en cada modificación. Esto puede 
//    	ser más eficiente
    }
}



