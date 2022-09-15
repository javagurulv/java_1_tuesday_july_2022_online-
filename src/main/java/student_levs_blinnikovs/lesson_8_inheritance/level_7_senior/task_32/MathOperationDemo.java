package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_32;

class MathOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 + 20
		Argument arg1 = new Argument(10);
		Argument arg2 = new Argument(20);
		MathOperation addition = new Addition(arg1, arg2);
		System.out.println("Left side Addition result = " + addition.calculate());

		// build and calculate: 50 - 20
		Argument arg3 = new Argument(50);
		Argument arg4 = new Argument(20);
		MathOperation subtraction = new Subtraction(arg3, arg4);
		System.out.println("Right side Subtraction result = " + subtraction.calculate());

		// build and calculate: (10 + 20) + (50 - 20)
		MathOperation addition1 = new Addition(addition, subtraction);
		System.out.println("Final Addition result = " + addition1.calculate());

		// build and calculate: (10 - 5) * (20 / 5)
		Argument arg5 = new Argument(5);
		MathOperation subtraction1 = new Subtraction(arg1,arg5);
		double subtractionResult = subtraction1.calculate();
		System.out.println("Left side subtraction result = " + subtractionResult);
		MathOperation division = new Division(arg2, arg5);
		double divisionResult = division.calculate();
		System.out.println("Right side division result = " + divisionResult);
		MathOperation multiplication = new Multiplication(subtraction1, division);
		double multiplicationResult = multiplication.calculate();
		System.out.println("Final user code result = " + multiplicationResult);

	}

}
