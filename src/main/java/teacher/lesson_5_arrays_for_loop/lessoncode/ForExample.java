package teacher.lesson_5_arrays_for_loop.lessoncode;

class ForExample {

	public static void main(String[] args) {
		int i = 1; // for first part

		if (i < 100) {
			System.out.println(i);
			i++;
		}

		if (i < 100) {
			System.out.println(i);
			i++;
		}

		if (i < 100) {
			System.out.println(i);
			i++;
		}

		if (i < 100) { // for second part
			System.out.println(i);
			i++; // for third part
		}

		for (int j = 1; j < 100; j++) {
			System.out.println(j);
		}

		for (int j = 100; j > 0; j--) {
			System.out.println(j);
		}


		System.out.println("First command after for!");

	}

}
