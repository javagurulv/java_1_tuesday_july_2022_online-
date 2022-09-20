package teacher.lesson_10_single_responsibility_principle.lessoncode;

import java.util.List;

public class SubObjectDemo {

	public static void main(String[] args) {
		SubObject tv = new SubObject("TV", 100.0D, List.of(RiskType.FIRE));
		SubObject comp = new SubObject("Comp", 200.0D, List.of(RiskType.FIRE, RiskType.THEFT));

		System.out.println(tv.isInsuredFor(RiskType.FIRE));
		System.out.println(tv.isInsuredFor(RiskType.THEFT));

	}

}
