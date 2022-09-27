package teacher.lesson_10_single_responsibility_principle.lessoncode.domain;

import java.util.List;

public class SubObject {

	private String name;
	private double sumInsured;
	private List<RiskType> riskTypes;

	public boolean isInsuredFor(RiskType riskType) {
		return riskTypes.contains(riskType);
	}

	public SubObject(String name,
					 double sumInsured,
					 List<RiskType> riskTypes) {
		this.name = name;
		this.sumInsured = sumInsured;
		this.riskTypes = riskTypes;
	}

	public String getName() {
		return name;
	}

	public double getSumInsured() {
		return sumInsured;
	}

	public List<RiskType> getRiskTypes() {
		return riskTypes;
	}
}
