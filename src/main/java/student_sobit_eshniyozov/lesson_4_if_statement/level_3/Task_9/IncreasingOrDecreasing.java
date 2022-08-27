package student_sobit_eshniyozov.lesson_4_if_statement.level_3.Task_9;

public class IncreasingOrDecreasing {
    int numberOne;
    int numberTwo;
    int numberThree;

    IncreasingOrDecreasing(int numberOne, int numberTwo, int numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }

    void showIncreasingOrDecreasing() {
        if (this.numberOne < this.numberTwo && this.numberTwo < this.numberThree) {
            System.out.println("Increasing!");
        }
        else if (this.numberOne>this.numberTwo && this.numberTwo>this.numberThree) {
            System.out.println("Decreasing!");

        }else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
