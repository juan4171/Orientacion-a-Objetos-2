package ar.edu.unlp.info.oo2.OO2_ej8_ToDo;

import java.time.LocalDateTime;

public class Paused extends State {
	
	@Override
	public void togglePause(ToDoItem i) {
		i.setState(new InProgress());
	}
	
	@Override
	public void finish(ToDoItem i) {
		i.setState(new Finished());
		i.setFin(LocalDateTime.now());
	}
}
