package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_32;

class Division extends TwoArgumentMathOperation {

	public Division(MathOperation leftArgument,
                    MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() / calculateRightSide();
	}
}
