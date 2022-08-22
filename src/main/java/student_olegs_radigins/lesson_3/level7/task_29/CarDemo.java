package student_olegs_radigins.lesson_3.level7.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CarDemo {
    public static void main(String[] args) {
        Car bus = new Car("bus","diesel", 8.0, "red");
        bus.description();
        bus.changeColor("black");
        bus.description();

        Car truck = new Car("truck","petrol", 12.5, "green");
        truck.description();
        truck.changeColor("blue");
        truck.description();
    }
}
