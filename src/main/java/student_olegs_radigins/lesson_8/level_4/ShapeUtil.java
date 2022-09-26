package student_olegs_radigins.lesson_8.level_4;

import java.util.Random;

class ShapeUtil {
    Random random = new Random();

    Circle createRandomCircle() {
        double randomRadius = random.nextDouble(100);
        return new Circle("Random circle", randomRadius);
    }

    Square createRandomSquare() {
        double randomSide = random.nextDouble(100);
        return new Square("Random square", randomSide);
    }

    Rectangle createRandomRectangle() {
        double randomSideA = random.nextDouble(100);
        double randomSideB = random.nextDouble(100);
        return new Rectangle("Random rectangle", randomSideA,randomSideB);
    }

    Triangle createRandomTriangle() {
        double randomSide = random.nextDouble(100);
        return new Triangle("Random triangle", randomSide);
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


}