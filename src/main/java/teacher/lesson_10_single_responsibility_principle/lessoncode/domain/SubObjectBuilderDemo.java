package teacher.lesson_10_single_responsibility_principle.lessoncode.domain;

public class SubObjectBuilderDemo {

	public static void main(String[] args) {

		SubObject tv = SubObjectBuilder.create()
				.withName("TV")
				.withSumInsured(10D)
				.withRiskType(RiskType.FIRE)
				.build();



	}

}
