package ar.edu.unlp.info.oo2.OO2_ej1_twitter;

import java.util.ArrayList;

public class Twitter {
	private ArrayList<Usuario> usuarios;
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public Twitter() {
		super();
		this.usuarios = new ArrayList<Usuario>();
	}

	public Usuario registrarUsuario(Usuario u) {
		if (this.existeUsuario(u.getScreenName())) { //TODO OO2 es correcta esta forma de registrar usuarios?
			return null;
		}	
		this.usuarios.add(u);
		return u;
	}
	
	private boolean existeUsuario(String screenName) {
		return this.usuarios.stream()
		.anyMatch(usuario -> usuario.getScreenName() == screenName); //TODO OO2 (usuario -> usuario.getScreenName() == screenName) seria envidia de atributos?
	}
	
	public void eliminarUsuario(Usuario u) { //TODO OO2 hace falta eliminar rts si ya lo remuevo?
		if (usuarios.remove(u)) { //remove devuelve true si se borro un elemento
			eliminarReferenciasDeTweets(u.getTweets());
			u.eliminarReTweets(); 
			u.eliminarTweets();
		}
	}
	
	private void eliminarReferenciasDeTweets(ArrayList<Tweet> tweets) {
		for (Usuario usuario : this.usuarios) {
			for (Tweet tweet : tweets) {
				usuario.eliminarRetweet(tweet);
			}
		}
	}
}

