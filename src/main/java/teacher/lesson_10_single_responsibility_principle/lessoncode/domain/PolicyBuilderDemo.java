package teacher.lesson_10_single_responsibility_principle.lessoncode.domain;

public class PolicyBuilderDemo {

	public static void main(String[] args) {

		Policy policy = PolicyBuilder.create()
				.with(PolicyObjectBuilder.create()
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
							  .build())
				.with(PolicyObjectBuilder.create()
							  .withName("Flat")
							  .with(SubObjectBuilder.create()
											.withName("TV")
											.withSumInsured(10D)
											.withRiskType(RiskType.FIRE)
											.build())
							  .with(SubObjectBuilder.create()
											.withName("COMP")
											.withSumInsured(10D)
											.withRiskType(RiskType.THEFT))
				)
				.build();

	}

}
