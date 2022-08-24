package student_ernest_aleskevics.lesson_4.level_1.task_1;

public class PositiveOrNegativeDemo {

    public static void main(String[] args) {
        // Positive
        PositiveOrNegative numberOne = new PositiveOrNegative (5);
        numberOne.printPositiveOrNegative();
        //Negative
        PositiveOrNegative numberTwo = new PositiveOrNegative (-2);
        numberTwo.printPositiveOrNegative();
        //Null
        PositiveOrNegative numberThree = new PositiveOrNegative (0);
        numberThree.printPositiveOrNegative();

    }
}
