package teacher.lesson_5_arrays_for_loop.lessoncode;

class ForSumExample {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i < 1000; i++) {
			sum = sum + i;
		}

		System.out.println("Sum = " + sum);
	}

}
