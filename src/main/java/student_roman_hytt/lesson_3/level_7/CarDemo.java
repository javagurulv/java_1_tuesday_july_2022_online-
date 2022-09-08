package student_roman_hytt.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CarDemo {
public static void main (String[]args) {
    Car y = new Car("Volvo", "123TEE");

    String carModel = y.getModel();
    String carNumber=y.getNumber();

    System.out.println( "Model " + carModel +" number "+carNumber);
    y.signal();
}

}
