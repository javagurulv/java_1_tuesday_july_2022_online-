package teacher.lesson_6_arrays_while_loop.lessoncode.validation;

public class Error {

	private String field;
	private String message;

	public Error(String field, String message) {
		this.field = field;
		this.message = message;
	}

	public String getField() {
		return field;
	}

	public String getMessage() {
		return message;
	}
}
