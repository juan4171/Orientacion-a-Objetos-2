/**
 * 
 */
package ar.edu.unlp.info.oo2.OO2_ej8_ToDo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	ToDoItem i1, i2, i3 , i4;
	
	@BeforeEach
	void setUp() throws Exception {
		i1 = new ToDoItem("Tarea");
		i2 = new ToDoItem("Pasear");
		i3 = new ToDoItem("Estudiar");
		i4 = new ToDoItem("Entrenar");
	}
    @Test
    public void testStart() {
		assertTrue(i1.getState() instanceof Pending);
		assertNull(i2.getComienzo());
		i1.start();
		assertTrue(i1.getState() instanceof InProgress);
		assertNotNull(i1.getComienzo());
		i2.start();
		assertTrue(i2.getState() instanceof InProgress);
		i2.start();
		assertTrue(i2.getState() instanceof InProgress);
		i2.togglePause();
		assertTrue(i2.getState() instanceof Paused);
		i2.start();
		assertTrue(i2.getState() instanceof Paused);
    }
    @Test
	public void testTogglePause() {
		i3.start();
		i3.togglePause();
		assertTrue(i3.getState() instanceof Paused);
		i3.togglePause();
		assertTrue(i3.getState() instanceof InProgress);
		i3.finish();
		assertTrue(i3.getState() instanceof Finished);
		
		assertThrows(RuntimeException.class, () -> i3.togglePause());
		assertThrows(RuntimeException.class, () -> i3.togglePause(),
				"El objeto ToDoItem no se encuentra en pause o in-progress");
		assertThrows(RuntimeException.class, () -> i4.togglePause(),
				"El objeto ToDoItem no se encuentra en pause o in-progress");
//		assertThrows:
//		Primer parámetro: La clase de excepción esperada.
//		Segundo parámetro: La expresión lambda que contiene el código que esperas que 
//		lance la excepción.
//		Tercer parámetro: Un mensaje de error opcional que se mostrará si la aserción falla.
	}
    @Test
	public void testFinish() {
		i2.finish();
		assertTrue(i2.getState() instanceof Pending);
		i1.start();
		assertNull(i1.getFin());
		i1.finish();
		assertTrue(i1.getState() instanceof Finished);
		assertNotNull(i1.getFin());
		i1.finish();
		assertTrue(i1.getState() instanceof Finished);
		i4.start();
		i4.togglePause();
		i4.finish();
		assertTrue(i4.getState() instanceof Finished);
		assertNotNull(i4.getFin());
	}
    @Test
	public void testWorkedTime() { // va a depender de la hora
		assertThrows(RuntimeException.class, () -> this.i3.workedTime());
		assertThrows(RuntimeException.class, () -> this.i3.workedTime(),
				"El objeto ToDoItem nunca empezó");
		i1.start();
		i1.setComienzo(LocalDateTime.of(2024, 3, 31, 15, 32, 0));
		i1.finish();
		i1.setFin(LocalDateTime.of(2024, 3, 31, 16, 32, 30));
		assertEquals(3630,i1.workedTime().getSeconds());
	}

	@Test
	public void testAddComment() {
		assertEquals(0, this.i1.getComentarios().size());
		this.i1.addComment("Hacer ejercicio 9 OO2");
		assertEquals(1, this.i1.getComentarios().size());
		this.i2.start();
		this.i2.finish();
		assertEquals(0, this.i2.getComentarios().size());
		this.i3.start();
		this.i3.addComment("Estudiar OO2");
		assertEquals("Estudiar OO2", this.i3.getComentarios().get(0));
		this.i3.addComment("Estudiar CPLP");
		assertEquals(2, this.i3.getComentarios().size());
		this.i4.start();
		this.i4.togglePause();
		this.i4.addComment("Pecho");
		assertEquals(1, this.i4.getComentarios().size());
	}


}
