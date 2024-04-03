package ar.edu.unlp.info.oo2._ej5_media;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

	private List<Media> listaMedia;
	
	public MediaPlayer() {
		super();
		this.listaMedia = new ArrayList<Media>();
	}

	public void agregarMedia(Media m) {
		this.listaMedia.add(m);
	}
	
	//implementacion random del play ya que el ej no pide nada especifico.
	public String play() {
		String aux="";
		for (Media media : listaMedia) {
			aux= aux + media.play() + ", ";
		}
		if (aux == "") {
			return aux;
		}
		return aux.substring(0, aux.length()-2) + ".";
	}

}
