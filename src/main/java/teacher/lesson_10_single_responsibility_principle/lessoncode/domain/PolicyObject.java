package teacher.lesson_10_single_responsibility_principle.lessoncode.domain;

import java.util.List;

public class PolicyObject {

	private String name;
	private List<SubObject> subObjects;

	public PolicyObject(String name,
						List<SubObject> subObjects) {
		this.name = name;
		this.subObjects = subObjects;
	}

	public String getName() {
		return name;
	}

	public List<SubObject> getSubObjects() {
		return subObjects;
	}
}
