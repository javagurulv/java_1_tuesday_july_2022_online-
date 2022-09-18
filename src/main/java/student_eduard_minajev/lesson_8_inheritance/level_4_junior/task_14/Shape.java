package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter ();

}
