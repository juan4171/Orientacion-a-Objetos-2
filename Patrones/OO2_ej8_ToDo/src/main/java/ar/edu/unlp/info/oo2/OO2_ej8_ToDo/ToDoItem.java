package ar.edu.unlp.info.oo2.OO2_ej8_ToDo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String nombre;
	private List<String> comentarios;
	private State state;
	private LocalDateTime comienzo;
	private LocalDateTime fin;
	
	public String getNombre() {
		return nombre;
	}

	public List<String> getComentarios() {
		return comentarios;
	}

	public State getState() {
		return state;
	}

	public LocalDateTime getComienzo() {
		return comienzo;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setComienzo(LocalDateTime comienzo) {
		this.comienzo = comienzo;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public ToDoItem(String name) {
		this.nombre = name;
		this.state = new Pending();
		this.comentarios = new ArrayList<>();
	}
	
	public void start() {
		state.start(this);
    }

	public void togglePause() {
		state.togglePause(this);
	}

	public void finish() {
		state.finish(this);
	}

	public Duration workedTime() {
		return state.workedTime(this);
	}
	
    public void addComment(String comment) {
    	state.addComment(this, comment);
    }
}
