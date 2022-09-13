package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import java.util.Random;

class ShapeUtil {

    Random random = new Random();

    Circle createRandomCircle() {
        double randomRadius = random.nextDouble(100);
        return new Circle(randomRadius);
    }

    Square createRandomSquare() {
        double randomSide = random.nextDouble(100);
        return new Square(randomSide);
    }

    Rectangle createRandomRectangle() {
        double randomSideOne = 51 + random.nextDouble(49); // 51 .. 100
        double randomSideTwo = random.nextDouble(50);      // 0 .. 50   pretty dumb rules, could do more, but it's ok.. just didn't want to create like square (which also would be OK)
        return new Rectangle(randomSideTwo, randomSideOne);
    }

    Triangle createRandomTriangle() {
        double randomSide = random.nextDouble(100);
        return new Triangle(randomSide);
    }

    Shape createRandomShape() {
        int randomNumber = random.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum += shape.calculateArea();
        }
        return areaSum;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeterSum = 0;
        for (Shape shape : shapes) {
            perimeterSum += shape.calculatePerimeter();
        }
        return perimeterSum;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
