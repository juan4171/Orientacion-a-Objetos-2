/**
 * 
 */
package ar.edu.unlp.info.oo2._ej5_media;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	MediaPlayer mediaPlayer;
	Audio audio;
	VideoFile videoFile;
	AdaptadorVideoStream adaptadorVideoStream;
	
	@BeforeEach
	void setUp() throws Exception {
		audio = new Audio();
		videoFile = new VideoFile();
		adaptadorVideoStream = new AdaptadorVideoStream();
		mediaPlayer = new MediaPlayer();		
	}
    @Test
    public void testPlay() {
    	mediaPlayer.agregarMedia(audio);
		mediaPlayer.agregarMedia(videoFile);
		mediaPlayer.agregarMedia(adaptadorVideoStream);
    	System.out.println(mediaPlayer.play());
    	assertEquals("Reproduciendo Audio, Reproduciendo VideoFile, Reproduciendo VideoStream.", mediaPlayer.play());      
    }
    public void testPlayVacio() {
    	System.out.println(mediaPlayer.play());
    	assertEquals("", mediaPlayer.play());      
    }
}
