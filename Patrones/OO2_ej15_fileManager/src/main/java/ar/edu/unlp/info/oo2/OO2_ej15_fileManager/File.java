package ar.edu.unlp.info.oo2.OO2_ej15_fileManager;

public class File implements FileOO2{
	
	private String nombre;
	private String extensión;
	private String tamaño;
	private String fechaCreación;
	private String fechaModificación;
	private String permisos;
	
	public File(String nombre, String extensión, String tamaño, String fechaCreación, String fechaModificación,
			String permisos) {
		super();
		this.nombre = nombre;
		this.extensión = extensión;
		this.tamaño = tamaño;
		this.fechaCreación = fechaCreación;
		this.fechaModificación = fechaModificación;
		this.permisos = permisos;
	}
	public String getNombre() {
		return nombre;
	}
	public String getExtensión() {
		return extensión;
	}
	public String getTamaño() {
		return tamaño;
	}
	public String getFechaCreación() {
		return fechaCreación;
	}
	public String getFechaModificación() {
		return fechaModificación;
	}
	public String getPermisos() {
		return permisos;
	}

	@Override
	public String prettyPrint() {
		return "prettyPrint:";
	}

}
