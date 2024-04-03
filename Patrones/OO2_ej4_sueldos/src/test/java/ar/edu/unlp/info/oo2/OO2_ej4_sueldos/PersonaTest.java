/**
 * 
 */
package ar.edu.unlp.info.oo2.OO2_ej4_sueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	Planta planta;
	Temporario temporario;
	Pasante pasante;
	
	@BeforeEach
	void setUp() throws Exception {
		planta = new Planta(true, 1, 10);
		temporario = new Temporario(true, 1, 10.5);
		pasante = new Pasante(1);
	}
	@Test
    public void testPlanta() {
        assertEquals(50000, planta.basico());
        assertEquals(27000, planta.adicional());
        assertEquals((50000 * 0.13) + (27000 * 0.05), planta.descuento());
    }
	@Test
    public void testTemporario() {
        assertEquals(23150, temporario.basico());
        assertEquals(7000, temporario.adicional());
        assertEquals((23150 * 0.13) + (7000 * 0.05), temporario.descuento());
    }
    
    @Test
    public void testPasante() {    	
        assertEquals(20000, pasante.basico());
        assertEquals(2000, pasante.adicional());
        assertEquals((20000 * 0.13) + (2000 * 0.05), pasante.descuento());
    } 
    
    @Test
    public void testSueldo() {
    	System.out.println(planta.sueldo());
    	System.out.println(temporario.sueldo());
    	System.out.println(pasante.sueldo());
        assertEquals(69150.0, planta.sueldo());
        assertEquals(26790.5, temporario.sueldo());
        assertEquals(19300.0, pasante.sueldo());
    }
}
