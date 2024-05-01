package ar.edu.unlp.info.oo2.OO2_ej8_ToDo;

import java.time.Duration;

public class Finished extends State {

	@Override
	public Duration workedTime(ToDoItem i) {
		return Duration.between(i.getComienzo(), i.getFin());
	}
	@Override
	public void addComment(ToDoItem i, String c) {
//		no hace nada	
	}
}
