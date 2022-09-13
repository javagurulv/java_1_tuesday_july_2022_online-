package teacher.lesson_8_inheritance.lessoncode.geometry;

class Square extends Shape {

	private double side;

	public Square(String name, double side) {
		super(name);
		this.side = side;
	}

	@Override
	double calculateArea() {
		return side * side;
	}

	@Override
	public String toString() {
		return "Square{" +
				"side=" + this.side +
				"name=" + getName() +
				'}';
	}
}
