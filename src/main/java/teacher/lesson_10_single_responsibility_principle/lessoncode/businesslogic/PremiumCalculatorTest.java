package teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic;

import java.util.List;

import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.Policy;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.PolicyObject;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.RiskType;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.SubObject;

class PremiumCalculatorTest {

	public static void main(String[] args) {
		PremiumCalculatorTest test = new PremiumCalculatorTest();
		test.testCase1();
		test.testCase2();
	}

	private void testCase1() {
		SubObject tv = new SubObject("TV", 100.0D, List.of(RiskType.FIRE));
		SubObject comp = new SubObject("Comp", 8.0D, List.of(RiskType.THEFT));
		PolicyObject home = new PolicyObject("Home", List.of(tv, comp));
		Policy policy = new Policy(List.of(home));

		PremiumCalculatorV1Impl calculator = new PremiumCalculatorV1Impl();
		double premium = calculator.calculate(policy);
		System.out.println("Test case 1 = " + premium);
	}

	private void testCase2() {
		SubObject tv = new SubObject("TV", 500.0D, List.of(RiskType.FIRE));
		SubObject comp = new SubObject("Comp", 102.51D, List.of(RiskType.THEFT));
		PolicyObject home = new PolicyObject("Home", List.of(tv, comp));
		Policy policy = new Policy(List.of(home));

		PremiumCalculatorV1Impl calculator = new PremiumCalculatorV1Impl();
		double premium = calculator.calculate(policy);
		System.out.println("Test case 2 = " + premium);
	}

}
