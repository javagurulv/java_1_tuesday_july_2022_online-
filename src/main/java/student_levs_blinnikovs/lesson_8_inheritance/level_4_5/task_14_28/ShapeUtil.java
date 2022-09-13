package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        int randomRadius = random.nextInt(100);
        return new Circle(randomRadius);
    }

}
