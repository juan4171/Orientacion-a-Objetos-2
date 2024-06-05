package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessProxyTest2 {
    private DatabaseAccess database;
    private DatabaseProxy proxy;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.proxy = new DatabaseProxy(database, "p4ssw0rD");
    }

    @Test
    void testGetSearchResults() {
    	Exception exceptionPending = assertThrows(RuntimeException.class, () -> this.proxy.getSearchResults("select * from comics where id=1"));
		assertEquals("No estas logueado.", exceptionPending.getMessage());
//		assertThrows:
//		Primer parámetro: La clase de excepción esperada.
//		Segundo parámetro: La expresión lambda que contiene el código que esperas que 
//		lance la excepción.
//		lo guardo en una variable y ahi puedo ver si el mensaje de error es correcto

    	this.proxy.login("p4ssw0rD");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
    	Exception exceptionPending = assertThrows(RuntimeException.class, () -> this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
		assertEquals("No estas logueado.",exceptionPending.getMessage());
    	this.proxy.login("p4ssw0rD");
        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
    }
}