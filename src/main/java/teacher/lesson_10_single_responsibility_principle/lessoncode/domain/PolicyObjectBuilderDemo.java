package teacher.lesson_10_single_responsibility_principle.lessoncode.domain;

public class PolicyObjectBuilderDemo {

	public static void main(String[] args) {

		PolicyObject home = PolicyObjectBuilder.create()
				.withName("Home")
				.with(SubObjectBuilder.create()
							  .withName("TV")
							  .withSumInsured(10D)
							  .withRiskType(RiskType.FIRE)
							  .build())
				.with(SubObjectBuilder.create()
							  .withName("COMP")
							  .withSumInsured(10D)
							  .withRiskType(RiskType.THEFT))
				.build();

	}

}
