package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {
	
	Biblioteca biblioteca;
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
//		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));

	}
	@Test
	public void testExportar() {
		assertTrue(this.biblioteca.exportarSocios().contains("Arya Stark"));
		assertFalse(this.biblioteca.exportarSocios().contains("Tyron Lannister"));
		String separator = System.lineSeparator();
		assertEquals("[" + separator +"\t{" + separator
				+ "\t\t\"nombre\": \"" + "Arya Stark" + "\"," + separator
				+ "\t\t\"email\": \"" + "needle@stark.com" + "\"," + separator
				+ "\t\t\"legajo\": \"" + "5234-5" + "\"" + separator
				+ "\t}"+ separator + "]", biblioteca.exportarSocios());	
	}
}
