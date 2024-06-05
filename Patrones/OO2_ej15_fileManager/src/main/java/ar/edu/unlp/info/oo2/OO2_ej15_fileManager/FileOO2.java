package ar.edu.unlp.info.oo2.OO2_ej15_fileManager;

public interface FileOO2{
	public abstract String getNombre();
	public abstract String getExtensión();
	public abstract String getTamaño();
	public abstract String getFechaCreación();
	public abstract String getFechaModificación();
	public abstract String getPermisos();
	public abstract String prettyPrint();
}
