package teacher.lesson_8_inheritance.lessoncode.geometry;

import java.util.ArrayList;
import java.util.List;

class GeometryDemo {

	public static void main(String[] args) {

		Shape shape1 = new Square("Square", 10D);
		Shape shape2 = new Circle("Circle", 2D);
		Shape shape3 = new SuperSquare("SuperSquare", 5D, "Red");

		Object shape4 = new Square("Square", 10D);

		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Square("Square", 10D));
		shapes.add(new Square("Square", 10D));
		shapes.add(new Circle("Circle", 2D));
		shapes.add(new Circle("Circle", 3D));
		shapes.add(new SuperSquare("SuperSquare", 5D, "Red"));



		double area = 0D;
		for (Shape shape : shapes) {
			area = area + shape.calculateArea();
		}

		for (Shape shape : shapes) {
			System.out.println(shape);
		}


/*
		for (int i = 0; i < shapes.size(); i++) {
			Shape shape = shapes.get(i);
			area = area + shape.calculateArea();
		}
*/

		System.out.println("Area = " + area);
	}

}
