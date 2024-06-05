package ar.edu.unlp.info.oo2.OO2_ej15_fileManager;

public class PermisosDecorator extends FileDecorator {
	
	public PermisosDecorator(FileOO2 f) {
		super(f);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getWrappee().getPermisos();
	}
}
