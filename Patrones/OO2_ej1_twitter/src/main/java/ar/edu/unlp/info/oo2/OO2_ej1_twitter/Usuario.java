package ar.edu.unlp.info.oo2.OO2_ej1_twitter;

import java.util.ArrayList;

public class Usuario {

	private String screenName;
	private ArrayList<Tweet> tweets;
	private ArrayList<ReTweet> retweets;
	
	public Usuario(String screenName) {
		super();
		this.screenName = screenName;
		this.retweets = new ArrayList<ReTweet>();
		this.tweets = new ArrayList<Tweet>();
	}

	public String getScreenName() {
		return screenName;
	}

	public ArrayList<ReTweet> getRetweets() {
		return retweets;
	}
	
	public ArrayList<Tweet> getTweets() {
		return tweets;
	}
	
	public void tweetear(String texto) {
		if (texto.length() > 1 && texto.length() < 280 ) {
			Tweet t = new Tweet(texto);	//unica forma de crear tweets, no puede haber tweets que no tengan mas de 1 y menos de 280 chars
			this.tweets.add(t);
		}
	}
	
	public void reTweetear(Tweet tweet) {
		ReTweet rt = new ReTweet(tweet);
		this.retweets.add(rt);
	}
	
	public void eliminarTweets() {
		this.tweets.clear();
	}
	
	public void eliminarReTweets() {
		this.retweets.clear();
	}

	public void eliminarRetweet(Tweet tweet) {
		this.retweets.removeIf(rt -> rt.tieneDeOrigen(tweet));
	}
	

}
