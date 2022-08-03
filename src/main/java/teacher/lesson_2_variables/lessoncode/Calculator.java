package teacher.lesson_2_variables.lessoncode;

class Calculator {

    public static void main(String[] args) {

		int numberOne = 10;

		numberOne = 5;

		long bigNumber = 10L;

		int numberTwo = 20;

        System.out.print("First number = ");
        System.out.println(numberOne);

		System.out.println("First number = " + numberOne);

        System.out.println("Second number = " + numberTwo);

		int result = numberOne + numberTwo;

        System.out.println("Result = " + result);
    }

}
