package ar.edu.unlp.info.oo2.OO2_ej8_ToDo;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class State {
	
	public void start(ToDoItem i) {
//		no hace nada	
	}

	public void togglePause(ToDoItem i) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	public void finish(ToDoItem i) {
//		no hace nada	
	}

	public Duration workedTime(ToDoItem i) {
		return Duration.between(i.getComienzo(), LocalDateTime.now());
	}

	public void addComment(ToDoItem i, String c) {
		i.getComentarios().add(c);
//		TODO OO2 consultar: me parece raro este metodo porque le estoy cambiando 
//		algo a otro objeto PERO puede ser lo correcto porque ya son clases 
//		"acopladas" como dice en la exp de practica
//		tambien consultar: ¿STATE puede ser clase abs? porque
//		en el libro habla de interface pero en este caso convendria que sea
//		abstracta porque me ahorro codigo repetido por ejemplo en addComment.
	}
}
