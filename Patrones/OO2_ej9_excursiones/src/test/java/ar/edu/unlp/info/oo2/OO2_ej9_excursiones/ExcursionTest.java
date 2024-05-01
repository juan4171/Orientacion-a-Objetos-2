/**
 * 
 */
package ar.edu.unlp.info.oo2.OO2_ej9_excursiones;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	
	private Excursion excursion;
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;

	@BeforeEach
	public void setUp() throws Exception {
		this.excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDateTime.of(2023, 4, 6, 12, 0), LocalDateTime.of(2023, 4, 6, 12, 0), 
									   "Terminal de Ómnibus de La Plata", 5000,1,2);
		this.usuario1 = new Usuario("Jose", "Sosa", "Sosa@gmail.com");
		this.usuario2 = new Usuario("Leo", "Messi", "Messi@gmail.com");
		this.usuario3 = new Usuario("Enzo", "Perez", "Perez@gmail.com");
	}

	@Test
	public void testInscribir() {
		System.out.println(this.excursion.obtenerInformacion()); //imprime los que faltan para el minimo
		this.excursion.inscribir(usuario1);
		System.out.println(this.excursion.obtenerInformacion()); //imprime los que faltan para el maximo
		this.excursion.inscribir(usuario2);
		System.out.println(this.excursion.obtenerInformacion()); //solo imprime los datos de la excursion
		this.excursion.inscribir(usuario3);
		assertEquals(2,this.excursion.getInscripciones().size());
		assertEquals(1,this.excursion.getListaDeEspera().size());
		assertTrue(this.excursion.getInscripciones().contains(usuario1));
		assertTrue(this.excursion.getInscripciones().contains(usuario2));
		assertFalse(this.excursion.getInscripciones().contains(usuario3));
		assertTrue(this.excursion.getListaDeEspera().contains(usuario3));
		assertTrue(this.excursion.getEstado() instanceof Completa);
	}
	@Test
	public void testObtenerMails() {
		assertEquals("",excursion.getMailsInscriptos());
		this.excursion.inscribir(usuario1);
		this.excursion.inscribir(usuario2);
		this.excursion.inscribir(usuario3);
		assertEquals("Sosa@gmail.com, Messi@gmail.com",excursion.getMailsInscriptos());
	}
}
