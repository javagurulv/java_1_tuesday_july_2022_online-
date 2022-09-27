package teacher.lesson_10_single_responsibility_principle.lessoncode.ui;

import java.util.List;

import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.Policy;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.PolicyObject;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.RiskType;
import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.SubObject;

public class PolicyDemo {

	public static void main(String[] args) {
		SubObject tv = new SubObject("TV", 100.0D, List.of(RiskType.FIRE));
		SubObject comp = new SubObject("Comp", 200.0D, List.of(RiskType.FIRE, RiskType.THEFT));

		PolicyObject home = new PolicyObject("Home", List.of(tv, comp));

		SubObject tv1 = new SubObject("TV", 100.0D, List.of(RiskType.FIRE));
		SubObject comp1 = new SubObject("Comp", 200.0D, List.of(RiskType.FIRE, RiskType.THEFT));
		SubObject comp2 = new SubObject("Comp", 200.0D, List.of(RiskType.FIRE, RiskType.THEFT));

		PolicyObject flat = new PolicyObject("Flat", List.of(tv1, comp1, comp2));

		Policy policy1 = new Policy(List.of(home));
		Policy policy2 = new Policy(List.of(flat));
		Policy policy3 = new Policy(List.of(home, flat));

	}

}
