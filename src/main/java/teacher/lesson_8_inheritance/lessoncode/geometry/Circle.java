package teacher.lesson_8_inheritance.lessoncode.geometry;

class Circle extends Shape {

	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}

}
