/**
 * 
 */
package ar.edu.unlp.info.oo2.OO2_ej2_PPT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OpcionTest {
	
	Jugada piedra;
	Jugada papel;
	Jugada tijera;
	Lagarto lagarto;
	Spock spock;
	
	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
		lagarto = new Lagarto();
		spock = new Spock();
	}
    @Test
    public void jugarContra() {
    	assertEquals("Papel cubre piedra", papel.jugarContra(piedra));
        assertEquals("Papel cubre piedra", piedra.jugarContra(papel));
        
        
    }
}
