package teacher.lesson_10_single_responsibility_principle.lessoncode;

import java.util.ArrayList;
import java.util.List;

import teacher.lesson_10_single_responsibility_principle.lessoncode.coefficient.CoefficientCalculatorService;

public class PremiumCalculator {

	private CoefficientCalculatorService coefficientCalculatorService;

	public PremiumCalculator() {
		coefficientCalculatorService = new CoefficientCalculatorService();
	}

	public double calculate(Policy policy) {
		return calculatePremiumFire(policy)
				+ calculatePremiumTheft(policy);
	}

	private double calculatePremiumFire(Policy policy) {
		List<SubObject> subObjects = findAllSubObjectsWithRiskType(policy, RiskType.FIRE);
		double sumInsured = calculateSumInsured(subObjects);
		double coefficient = coefficientCalculatorService.calculate(RiskType.FIRE, sumInsured);
		return sumInsured * coefficient;
	}

	private double calculateSumInsured(List<SubObject> subObjects) {
		double sumInsured = 0.0D;
		for (SubObject subObject : subObjects) {
			sumInsured = sumInsured + subObject.getSumInsured();
		}
		return sumInsured;
	}

	private List<SubObject> findAllSubObjectsWithRiskType(Policy policy, RiskType riskType) {
		List<SubObject> subObjects = new ArrayList<>();
		for (PolicyObject policyObject : policy.getPolicyObjects()) {
			for (SubObject subObject : policyObject.getSubObjects()) {
				if (subObject.isInsuredFor(riskType)) {
					subObjects.add(subObject);
				}
			}
		}
		return subObjects;
	}

	private double calculatePremiumTheft(Policy policy) {
		List<SubObject> subObjects = findAllSubObjectsWithRiskType(policy, RiskType.THEFT);
		double sumInsured = calculateSumInsured(subObjects);
		double coefficient = coefficientCalculatorService.calculate(RiskType.THEFT, sumInsured);
		return sumInsured * coefficient;
	}

}
