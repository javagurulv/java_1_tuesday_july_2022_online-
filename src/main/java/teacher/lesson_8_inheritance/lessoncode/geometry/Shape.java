package teacher.lesson_8_inheritance.lessoncode.geometry;

public abstract class Shape extends Object {

	private String name;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract double calculateArea();

}
