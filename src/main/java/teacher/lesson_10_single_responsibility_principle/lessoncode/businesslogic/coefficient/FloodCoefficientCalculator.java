package teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic.coefficient;

import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.RiskType;

class FloodCoefficientCalculator implements CoefficientCalculator {

	@Override
	public RiskType getApplicableRiskType() {
		return RiskType.FLOOD;
	}

	@Override
	public double calculate(double sumInsured) {
		return sumInsured > 5000 ? 0.024D : 0.014D;
	}

}
