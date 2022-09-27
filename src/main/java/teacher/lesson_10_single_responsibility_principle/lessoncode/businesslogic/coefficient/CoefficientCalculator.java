package teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic.coefficient;

import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.RiskType;

interface CoefficientCalculator {

	RiskType getApplicableRiskType();

	double calculate(double sumInsured);

}
