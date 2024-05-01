package ar.edu.unlp.info.oo2.OO2_ej8_ToDo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State {

	@Override
	public void start(ToDoItem i) {
		i.setState(new InProgress());
		i.setComienzo(LocalDateTime.now());
	}

	@Override
	public Duration workedTime(ToDoItem i) {
		throw new RuntimeException("ERROR: the task never started");	
	}
}
