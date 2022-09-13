package teacher.lesson_8_inheritance.lessoncode.geometry;

class SuperSquare extends Square {

	private String color;

	public SuperSquare(String name, double side, String color) {
		super(name, side);
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + "SuperSquare{" +
				"color='" + color + '\'' +
				'}';
	}

}
