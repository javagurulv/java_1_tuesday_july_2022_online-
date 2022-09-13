package student_levs_blinnikovs.lesson_8_inheritance.level_4_junior.task_14_19;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
