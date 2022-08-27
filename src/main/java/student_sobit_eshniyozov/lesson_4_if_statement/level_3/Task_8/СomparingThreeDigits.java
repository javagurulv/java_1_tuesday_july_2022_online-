package student_sobit_eshniyozov.lesson_4_if_statement.level_3.Task_8;
//        Write a Java program that accepts three numbers and prints:
//        - "All numbers are equal" if all three numbers are equal,
//        - "All numbers are different" if all three numbers are different
//        - "Neither all are equal or different" otherwise.
class СomparingThreeDigits {
    int numberOne;
    int numberTwo;
    int numberThree;

    СomparingThreeDigits(int numberOne, int numberTwo, int numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }

    void showСomparingThreeDigits() {
        if (this.numberOne == this.numberTwo && this.numberOne == this.numberThree) {
            System.out.println("All numbers are equals!");
        }
        else if (this.numberOne!=this.numberTwo && this.numberTwo!=this.numberThree) {
            System.out.println("All number are different!");

        }else {
            System.out.println("Neither all are equal or different!");
        }
    }
}