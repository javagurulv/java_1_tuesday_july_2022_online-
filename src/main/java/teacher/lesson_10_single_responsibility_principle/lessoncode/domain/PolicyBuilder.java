package teacher.lesson_10_single_responsibility_principle.lessoncode.domain;

import java.util.ArrayList;
import java.util.List;

public class PolicyBuilder {

	private List<PolicyObject> policyObjects = new ArrayList<>();

	public static PolicyBuilder create() {
		return new PolicyBuilder();
	}

	public Policy build() {
		return new Policy(policyObjects);
	}

	public PolicyBuilder with(PolicyObject policyObject) {
		this.policyObjects.add(policyObject);
		return this;
	}

	public PolicyBuilder with(PolicyObjectBuilder policyObjectBuilder) {
		this.policyObjects.add(policyObjectBuilder.build());
		return this;
	}

}
