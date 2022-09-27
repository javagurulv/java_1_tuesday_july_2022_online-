package teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic;

import java.util.ArrayList;
import java.util.List;

import teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic.coefficient.CoefficientCalculatorService;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.Policy;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.PolicyObject;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.RiskType;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.SubObject;

public class PremiumCalculatorV1Impl implements PremiumCalculator {

	private CoefficientCalculatorService coefficientCalculatorService;

	public PremiumCalculatorV1Impl() {
		coefficientCalculatorService = new CoefficientCalculatorService();
	}

	@Override
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
