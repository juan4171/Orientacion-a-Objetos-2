package ar.edu.unlp.info.oo2.OO2_ej15_fileManager;

public class ExtensionDecorator extends FileDecorator {
	
	public ExtensionDecorator(FileOO2 f) {
		super(f);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getWrappee().getExtensión();
	}
}
