/**
 * 
 */
package ar.edu.unlp.info.oo2.OO2_ej1_twitter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	
	Usuario sosa;
	Usuario perez;
	String texto0;
	String texto280;
	String textoValido;
	
	@BeforeEach
	void setUp() throws Exception {
		sosa= new Usuario("Jose Sosa");
		perez= new Usuario("Enzo Perez");
		texto0= ("");
		textoValido= ("ejemplo tweet");
		texto280= ("+280 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vitae sapien id justo fermentum commodo. Nullam eget lectus magna. Fusce vel mauris ipsum. Suspendisse potenti. Cras id libero ultrices, dictum ligula sed, tempor tortor. Donec a magna hendrerit, molestie urna nec.");
	}
    @Test
    public void tweetear() {
    	perez.tweetear(texto0);
    	assertEquals(0, perez.getTweets().size());
    	perez.tweetear(textoValido);
    	assertEquals(1, perez.getTweets().size());
    	perez.tweetear(texto280);
    	assertEquals(1, perez.getTweets().size());
    }
    @Test
    public void reTweetear() {
    	perez.tweetear(textoValido);
    	sosa.reTweetear(perez.getTweets().get(0));
    	assertEquals(1, sosa.getRetweets().size());
    }
}
