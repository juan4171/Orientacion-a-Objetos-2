/**
 * 
 */
package ar.edu.unlp.info.oo2.OO2_ej6_topografias;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	//creo q seria "mas correcto" hacer un test por cada clase tierra, agua, mixta y pantano
	Agua a;
	Tierra t;
	Mixta mixta1;
	Mixta mixtaIgualA1;
	Mixta mixta2;
	Pantano p;
	
	@BeforeEach
	void setUp() throws Exception {
		a = new Agua();
		t = new Tierra();
		mixta1 = new Mixta(a, t, t, a);
		mixtaIgualA1 = new Mixta(a, t, t, a);
		mixta2 = new Mixta(a, t, t, mixta1);
		p= new Pantano();
	}
    @Test
    public void testAgua() {
        assertEquals(1, a.proporcionAgua());
        assertEquals(0, a.proporcionTierra()); 
    }
    @Test
    public void testTierra() {
        assertEquals(0, t.proporcionAgua());
        assertEquals(1, t.proporcionTierra()); 
    }
    @Test
    public void testMixta1() {
        assertEquals(0.5, mixta1.proporcionAgua());
        assertEquals(0.5, mixta1.proporcionTierra()); 
    }
    @Test
    public void testMixta2() {
        assertEquals(0.375, mixta2.proporcionAgua());
        assertEquals(0.625, mixta2.proporcionTierra()); 
    }
    @Test
    public void testPantano() {
        assertEquals(0.7, p.proporcionAgua());
        assertEquals(0.3, p.proporcionTierra(), 0.001); 
        //El tercer argumento del assertEquals (0.001) especifica que se permite una diferencia 
        //de hasta 0.001 entre el valor esperado (0.3) y el valor obtenido.
        //esto es porque el proporcionTierra() por alguna razon da 0.30000000000000004
        //y no se puede evitar, es asi
    }
    @Test
    public void testIgual() {
    	//agua
    	assertEquals(true, a.igual(a)); 
        assertEquals(false, a.igual(t));      
        assertEquals(false, a.igual(mixta1));
        assertEquals(false, a.igual(p)); 
        //mixta
        assertEquals(false, mixta1.igual(mixta2)); 
        assertEquals(true, mixta1.igual(mixtaIgualA1)); 
        assertEquals(false, mixta1.igual(a)); 
        assertEquals(false, mixta1.igual(t));
        assertEquals(false, mixta1.igual(p));
        //tierra
        assertEquals(true, t.igual(t)); 
        assertEquals(false, t.igual(a));      
        assertEquals(false, t.igual(mixta1)); 
        assertEquals(false, t.igual(p)); 
        //pantano
        assertEquals(false, p.igual(a)); 
        assertEquals(false, p.igual(t));      
        assertEquals(false, p.igual(mixta1)); 
        assertEquals(true, p.igual(p)); 
    }
}
