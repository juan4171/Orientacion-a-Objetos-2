package ar.edu.unlp.info.oo2.OO2_ej15_fileManager;

public class TamañoDecorator extends FileDecorator {
	
	public TamañoDecorator(FileOO2 f) {
		super(f);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getWrappee().getTamaño();
	}
}
