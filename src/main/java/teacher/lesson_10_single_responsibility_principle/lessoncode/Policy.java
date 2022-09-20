package teacher.lesson_10_single_responsibility_principle.lessoncode;

import java.util.List;

public class Policy {

	private List<PolicyObject> policyObjects;

	public Policy(List<PolicyObject> policyObjects) {
		this.policyObjects = policyObjects;
	}

	public List<PolicyObject> getPolicyObjects() {
		return policyObjects;
	}

}
