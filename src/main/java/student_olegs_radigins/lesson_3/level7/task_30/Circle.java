package student_olegs_radigins.lesson_3.level7.task_30;

class Circle {
    double radius;
     static double pi = 3.14;

     Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double calculatedArea = pi * radius * radius;
        System.out.println("Area of a circle= " + calculatedArea);

    }


}
