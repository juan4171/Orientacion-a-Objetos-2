package ar.edu.unlp.info.oo2.OO2_ej15_fileManager;

public class CreacionDecorator extends FileDecorator {
	
	public CreacionDecorator(FileOO2 f) {
		super(f);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getWrappee().getFechaCreación();
	}
}
