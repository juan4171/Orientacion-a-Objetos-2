package ar.edu.unlp.info.oo2.OO2_ej1_twitter;

public class ReTweet{
	private Tweet origen;

	public ReTweet(Tweet origen) {
		super();
		this.origen = origen;
	}

	public boolean tieneDeOrigen(Tweet tweet) {
		return this.origen.equals(tweet);
	}

}
