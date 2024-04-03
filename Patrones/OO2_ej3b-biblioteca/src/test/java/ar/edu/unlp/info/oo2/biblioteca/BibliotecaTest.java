package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {
	
	Biblioteca biblioteca;
	JSONSimpleAdapter JSONSimpleAdaptador;
	JSONParser parser;
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
	//	biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		
		JSONSimpleAdaptador = new JSONSimpleAdapter();
		biblioteca.setExporter(JSONSimpleAdaptador);	
		parser = new JSONParser();
	}
	@Test
	public void testExportar() throws ParseException {
		assertTrue(this.biblioteca.exportarSocios().contains("Arya Stark"));
		assertFalse(this.biblioteca.exportarSocios().contains("Tyron Lannister"));
		
		String separator = System.lineSeparator();
		String socio = "[" + separator +"\t{" + separator
			+ "\t\t\"nombre\": \"" + "Arya Stark" + "\"," + separator
			+ "\t\t\"email\": \"" + "needle@stark.com" + "\"," + separator
			+ "\t\t\"legajo\": \"" + "5234-5" + "\"" + separator
			+ "\t}"+ separator + "]";
		
		assertEquals("[{\"legajo\":\"5234-5\",\"nombre\":\"Arya Stark\",\"email\":\"needle@stark.com\"}]", 
				biblioteca.exportarSocios());
		assertEquals(parser.parse(socio), parser.parse(biblioteca.exportarSocios()));
		//TODO el voorheesExporter "formatea" los strings de los json difetente
		//a los strings del adapter json.simple, esta bien igual?
	}
}
