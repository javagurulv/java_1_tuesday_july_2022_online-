package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_32;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class TwoArgumentMathOperation extends MathOperation {

	private MathOperation leftArgument;
	private MathOperation rightArgument;

	public TwoArgumentMathOperation(MathOperation leftArgument,
                                    MathOperation rightArgument) {
		this.leftArgument = leftArgument;
		this.rightArgument = rightArgument;
	}

	protected double calculateLeftSide() {
		return leftArgument.calculate();
	}

	protected double calculateRightSide() {
		return rightArgument.calculate();
	}

}
