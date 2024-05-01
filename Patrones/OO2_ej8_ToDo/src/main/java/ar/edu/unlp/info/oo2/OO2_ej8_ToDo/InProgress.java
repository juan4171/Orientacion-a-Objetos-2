package ar.edu.unlp.info.oo2.OO2_ej8_ToDo;

import java.time.LocalDateTime;

public class InProgress extends State {

	@Override
	public void togglePause(ToDoItem i) {
		i.setState(new Paused());
	}

	@Override
	public void finish(ToDoItem i) {
		i.setState(new Finished());
		i.setFin(LocalDateTime.now());
	}
	
}
