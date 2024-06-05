package ar.edu.unlp.info.oo2.OO2_ej15_fileManager;

//esta clase puede ser abstracta o no
public class FileDecorator implements FileOO2 {
	private FileOO2 wrappee;
	
	public FileDecorator(FileOO2 f) {
		super();
		this.wrappee=f;
	}
	
	public FileOO2 getWrappee() {
		return wrappee;
	}	

	@Override
	public String getNombre() {
		return wrappee.getNombre();
	}

	@Override
	public String getExtensión() {
		return wrappee.getExtensión();
	}

	@Override
	public String getTamaño() {
		return wrappee.getTamaño();
	}

	@Override
	public String getFechaCreación() {
		return wrappee.getFechaCreación();
	}

	@Override
	public String getFechaModificación() {
		return wrappee.getFechaModificación();
	}

	@Override
	public String getPermisos() {
		return wrappee.getPermisos();
	}
	
	@Override
	public String prettyPrint() {
		return this.wrappee.prettyPrint() + " ";
	}

}
