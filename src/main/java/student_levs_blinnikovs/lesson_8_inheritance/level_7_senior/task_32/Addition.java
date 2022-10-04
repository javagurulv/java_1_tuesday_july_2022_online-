package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_32;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Addition extends TwoArgumentMathOperation {

	public Addition(MathOperation leftArgument,
                    MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() + calculateRightSide();
	}
}
