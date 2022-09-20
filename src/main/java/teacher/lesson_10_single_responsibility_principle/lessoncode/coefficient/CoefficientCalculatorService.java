package teacher.lesson_10_single_responsibility_principle.lessoncode.coefficient;

import java.util.List;

import teacher.lesson_10_single_responsibility_principle.lessoncode.RiskType;

public class CoefficientCalculatorService {

	private List<CoefficientCalculator> calculators;

	public CoefficientCalculatorService() {
		calculators = List.of(
				new FireCoefficientCalculator(),
				new TheftCoefficientCalculator(),
				new FloodCoefficientCalculator()
		);
	}

	public double calculate(RiskType riskType, double sumInsured) {
		for (CoefficientCalculator calculator : calculators) {
			if (calculator.getApplicableRiskType().equals(riskType)) {
				return calculator.calculate(sumInsured);
			}
		}
		throw new IllegalArgumentException("No implementation of RiskTypeCoefficient");
	}

}
