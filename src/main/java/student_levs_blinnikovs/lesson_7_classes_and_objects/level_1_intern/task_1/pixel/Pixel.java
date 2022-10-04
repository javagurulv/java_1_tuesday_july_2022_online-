package student_levs_blinnikovs.lesson_7_classes_and_objects.level_1_intern.task_1.pixel;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Pixel {

    private int red;
    private int green;
    private int blue;

    Pixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    int getRed() {
        return this.red;
    }

    int getGreen() {
        return this.green;
    }

    int getBlue() {
        return this.blue;
    }

}
