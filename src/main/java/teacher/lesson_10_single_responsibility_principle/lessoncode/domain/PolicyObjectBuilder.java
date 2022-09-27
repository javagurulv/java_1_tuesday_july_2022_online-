package teacher.lesson_10_single_responsibility_principle.lessoncode.domain;

import java.util.ArrayList;
import java.util.List;

public class PolicyObjectBuilder {

	private String name;
	private List<SubObject> subObjects = new ArrayList<>();

	public static PolicyObjectBuilder create() {
		return new PolicyObjectBuilder();
	}

	public PolicyObject build() {
		return new PolicyObject(name, subObjects);
	}

	public PolicyObjectBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public PolicyObjectBuilder with(SubObject subObject) {
		this.subObjects.add(subObject);
		return this;
	}

	public PolicyObjectBuilder with(SubObjectBuilder subObjectBuilder) {
		this.subObjects.add(subObjectBuilder.build());
		return this;
	}

}
