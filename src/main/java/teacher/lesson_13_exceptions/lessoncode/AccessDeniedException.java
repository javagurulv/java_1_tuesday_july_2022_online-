package teacher.lesson_13_exceptions.lessoncode;

public class AccessDeniedException extends Exception {

	private String invalidSequrityKey;

	public AccessDeniedException(String message, String invalidSequrityKey) {
		super(message);
		this.invalidSequrityKey = invalidSequrityKey;
	}

	public String getInvalidSequrityKey() {
		return invalidSequrityKey;
	}
}
