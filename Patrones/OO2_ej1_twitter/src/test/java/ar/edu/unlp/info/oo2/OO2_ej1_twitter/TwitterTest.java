/**
 * 
 */
package ar.edu.unlp.info.oo2.OO2_ej1_twitter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Twitter twitter;
	Usuario sosa;
	Usuario perez;
	Usuario falsoSosa;
	
	@BeforeEach
	void setUp() throws Exception {
		perez= new Usuario("Enzo Perez");
		sosa= new Usuario("Jose Sosa");
		falsoSosa= new Usuario("Jose Sosa");
		sosa.tweetear("primer tweet");
		perez.tweetear("segundo tweet");
		perez.reTweetear(sosa.getTweets().get(0));
		twitter = new Twitter();	
	}
    @Test
    public void registrarUsuario() {
    	assertEquals(0, twitter.getUsuarios().size());
    	twitter.registrarUsuario(sosa);
		twitter.registrarUsuario(perez);
    	twitter.registrarUsuario(falsoSosa);
    	assertEquals(2, twitter.getUsuarios().size());
    }
    @Test
    public void eliminarUsuario() {
    	twitter.registrarUsuario(sosa);
		twitter.registrarUsuario(perez);
    	assertEquals(2, twitter.getUsuarios().size());
    	twitter.eliminarUsuario(falsoSosa);
    	assertEquals(2, twitter.getUsuarios().size());
    	
    	assertEquals(1, perez.getRetweets().size());
    	twitter.eliminarUsuario(sosa);
    	assertEquals(1, twitter.getUsuarios().size());
    	assertEquals(0, perez.getRetweets().size());
    	
    }
}
