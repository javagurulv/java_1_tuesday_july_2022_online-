/* Создание вспомогательного кода для иерархии Shape (геометрическая фигура).

Создайте класс ShapeUtil.

В классе ShapeUtil реализуйте метод:

    Circle createRandomCircle();

Этот метод должен создавать круг со случайным радиусом.

 */

package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

import java.util.Random;

public class ShapeUtil  {

    Random random = new Random();

    Circle createRandomCircle () {
        double circleRadius = random.nextDouble(10);
        return new Circle("Circle",circleRadius);
    }

    Square createRandomSquare () {
        double sideLength = random.nextDouble(10);
        return new Square("Square", sideLength);
    }

    Rectangle createRandomRectangle () {
        double sideLength = random.nextDouble(10);
        double widthLength = random.nextDouble(10);
        return new Rectangle("Rectangle", sideLength, widthLength);
    }

    Triangle createRandomTriangle () {
        double sideLength = random.nextDouble(10);
        return new Triangle("Triangle",sideLength);
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
        double totalArea = 0;
        for (Shape shape: shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    double calculatePerimeter (Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape: shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }


}
