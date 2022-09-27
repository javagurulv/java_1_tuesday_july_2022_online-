package teacher.lesson_10_single_responsibility_principle.lessoncode.domain;

import java.util.ArrayList;
import java.util.List;

public class SubObjectBuilder {

	private String name;
	private double sumInsured;
	private List<RiskType> riskTypes = new ArrayList<>();


	public static SubObjectBuilder create() {
		return new SubObjectBuilder();
	}

	public SubObject build() {
		return new SubObject(name, sumInsured, riskTypes);
	}

	public SubObjectBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public SubObjectBuilder withSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
		return this;
	}

	public SubObjectBuilder withRiskType(RiskType riskType) {
		this.riskTypes.add(riskType);
		return this;
	}

}
