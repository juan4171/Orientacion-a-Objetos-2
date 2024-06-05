/**
 * 
 */
package ar.edu.unlp.info.oo2.OO2_ej19_personajes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonajeTest {
	private ArqueroCreator creadorArquero;
	private GuerreroCreator creadorGuerrero;
	private MagoCreator creadorMago;
	private Personaje mago;
	private Personaje arquero;
	private Personaje guerrero;

	@BeforeEach
	void setUp() throws Exception {
		creadorArquero = new ArqueroCreator();
		arquero = creadorArquero.crear();
		creadorGuerrero = new GuerreroCreator();
		guerrero = creadorGuerrero.crear();
		creadorMago = new MagoCreator();
		mago = creadorMago.crear();
	}

	@Test
	void testCrearPersonaje() {
		assertEquals("mago", mago.getNombre());
		assertEquals("guerrero", guerrero.getNombre());
		assertEquals("arquero", arquero.getNombre());
		assertEquals(100, mago.getPtsVida());
		assertEquals(100, guerrero.getPtsVida());
		assertEquals(100, arquero.getPtsVida());
	}
	
	@Test
	void testAtacarGuerrero() {
		guerrero.atacar(mago); //8 de vida tiene armadura de cuero
		assertEquals(92, mago.getPtsVida());
		guerrero.atacar(guerrero); //3 de vida tiene armadura de acero
		assertEquals(97, guerrero.getPtsVida());
	}
	
	@Test
	void testAtacarArquero() {
		arquero.atacar(guerrero); //2 de vida tiene armadura de acero
		assertEquals(98, guerrero.getPtsVida());
		arquero.atacar(mago); //5 de vida tiene armadura de cuero
		assertEquals(95, mago.getPtsVida());
	}
	
	@Test
	void testAtacarMago() {
		mago.atacar(arquero); //2 de vida tiene armadura de cuero
		assertEquals(98, arquero.getPtsVida());
		mago.atacar(guerrero); //1 de vida tiene armadura de acero
		assertEquals(99, guerrero.getPtsVida());
	}
}
