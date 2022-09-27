package teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic.coefficient;

import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.RiskType;

class TheftCoefficientCalculator implements CoefficientCalculator {

	@Override
	public RiskType getApplicableRiskType() {
		return RiskType.THEFT;
	}

	@Override
	public double calculate(double sumInsured) {
		return sumInsured >= 15 ? 0.05D : 0.11D;
	}

}
