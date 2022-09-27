package teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic.coefficient;

import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.RiskType;

class FireCoefficientCalculator implements CoefficientCalculator {

	@Override
	public RiskType getApplicableRiskType() {
		return RiskType.FIRE;
	}

	@Override
	public double calculate(double sumInsured) {
		return sumInsured > 100 ? 0.024D : 0.014D;
	}

}
