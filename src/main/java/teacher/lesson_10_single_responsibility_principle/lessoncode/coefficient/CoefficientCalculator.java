package teacher.lesson_10_single_responsibility_principle.lessoncode.coefficient;

import teacher.lesson_10_single_responsibility_principle.lessoncode.RiskType;

interface CoefficientCalculator {

	RiskType getApplicableRiskType();

	double calculate(double sumInsured);

}
