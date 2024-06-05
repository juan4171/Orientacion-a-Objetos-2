package ar.edu.unlp.info.oo2.OO2_ej15_fileManager;

public class NombreDecorator extends FileDecorator {
	
	public NombreDecorator(FileOO2 f) {
		super(f);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getWrappee().getNombre();
	}
}
