package teacher.lesson_10_single_responsibility_principle.lessoncode.ui;

import java.util.List;
import java.util.Random;

import teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic.PremiumCalculator;
import teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic.PremiumCalculatorV1Impl;
import teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic.PremiumCalculatorV2Impl;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.Policy;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.PolicyObject;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.RiskType;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.SubObject;

public class PolicyUI {

	public static void main(String[] args) {

		SubObject tv = new SubObject("TV", 100.0D, List.of(RiskType.FIRE));
		SubObject comp = new SubObject("Comp", 200.0D, List.of(RiskType.FIRE, RiskType.THEFT));

		PolicyObject home = new PolicyObject("Home", List.of(tv, comp));

		Policy policy = new Policy(List.of(home));

		PremiumCalculator premiumCalculator = choiceImplementation();

		double premium = premiumCalculator.calculate(policy);

		System.out.println("Policy premium = " + premium);
	}

	private static PremiumCalculator choiceImplementation() {
		Random random = new Random();
		int randomNumber = random.nextInt(2);
		if (randomNumber == 0) {
			return new PremiumCalculatorV1Impl();
		} else {
			return new PremiumCalculatorV2Impl();
		}
	}


}
