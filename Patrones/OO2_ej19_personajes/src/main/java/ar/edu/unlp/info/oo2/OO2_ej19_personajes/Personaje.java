package ar.edu.unlp.info.oo2.OO2_ej19_personajes;

import java.util.List;

public class Personaje {
	
	private String nombre;
	private Armadura armadura;
	private Arma arma;
	private List<String> habilidades;
	private int ptsVida;

	

	public Personaje(String nombre, Armadura armadura, Arma arma, List<String> habilidades) {
		super();
		this.nombre = nombre;
		this.armadura = armadura;
		this.arma = arma;
		this.habilidades = habilidades;
		this.ptsVida = 100;
	}
	
	public boolean puedeConvatir(){
		return this.ptsVida > 0;
	}
	
	public void recibirAtaque(Arma arma) {
		if (this.puedeConvatir()) {
			this.ptsVida = this.ptsVida - arma.calcularDaño(this.getArmadura());
		}
	}

	public void atacar(Personaje personaje) {
		if (this.puedeConvatir()) {
			personaje.recibirAtaque(this.getArma());
		}
	}

	public Arma getArma() {
		return arma;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public String getNombre() {
		return nombre;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}
	
	public int getPtsVida() {
		return ptsVida;
	}
}
