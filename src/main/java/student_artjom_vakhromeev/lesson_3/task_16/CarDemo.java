package student_artjom_vakhromeev.lesson_3.task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
