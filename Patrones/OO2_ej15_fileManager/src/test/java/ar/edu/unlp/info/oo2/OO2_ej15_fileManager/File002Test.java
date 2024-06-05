/**
 * 
 */
package ar.edu.unlp.info.oo2.OO2_ej15_fileManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class File002Test {
	
	FileOO2 f1;
	
	@BeforeEach
	void setUp() throws Exception {
		f1 = new File("f1", "txt", "10gb", "17/05/2024", "18/05/2024", "admin");
	}
    @Test
    public void testOp1() {
    	FileOO2 nombre = new NombreDecorator(f1);
    	FileOO2 extension = new ExtensionDecorator(nombre);
        assertEquals("prettyPrint: f1 txt", extension.prettyPrint());
    }
    @Test
    public void testOp2() {
    	FileOO2 nombre = new NombreDecorator(f1);
    	FileOO2 extension = new ExtensionDecorator(nombre);
    	FileOO2 creacion = new CreacionDecorator(extension);
        assertEquals("prettyPrint: f1 txt 17/05/2024", creacion.prettyPrint());
    }
    @Test
    public void testOp3() {
    	FileOO2 permisos = new PermisosDecorator(f1);
    	FileOO2 nombre = new NombreDecorator(permisos);
    	FileOO2 extension = new ExtensionDecorator(nombre);
    	FileOO2 tamaño = new TamañoDecorator(extension);
        assertEquals("prettyPrint: admin f1 txt 10gb", tamaño.prettyPrint());
    }
}
