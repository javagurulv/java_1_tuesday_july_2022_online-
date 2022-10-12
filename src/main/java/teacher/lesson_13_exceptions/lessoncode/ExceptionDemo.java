package teacher.lesson_13_exceptions.lessoncode;

public class ExceptionDemo {

	public static void main(String[] args) throws AccessDeniedException {
		m1();
		System.out.println("Continue main()");
	}

	private static void m1() {
		try {
			m2();
		} catch (AccessDeniedException e) {
			System.out.println("Catch exception = " + e.getInvalidSequrityKey());
			e.printStackTrace();
		}

		System.out.println("Continue m1()");
	}

	private static void m2() throws AccessDeniedException {
		AccessDeniedException exception = new AccessDeniedException("Invalid sequrity key", "sdfsdfs");
		throw exception;
	}


}
