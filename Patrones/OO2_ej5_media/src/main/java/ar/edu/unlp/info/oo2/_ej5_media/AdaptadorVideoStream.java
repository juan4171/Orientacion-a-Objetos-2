package ar.edu.unlp.info.oo2._ej5_media;

public class AdaptadorVideoStream extends Media{

	private VideoStream videoStream = new VideoStream();
	// TODO esta bien poner el new aca? o deberia meterlo en un constructor?
	
	@Override
	public String play() {
		return videoStream.reproduce();
	}

}