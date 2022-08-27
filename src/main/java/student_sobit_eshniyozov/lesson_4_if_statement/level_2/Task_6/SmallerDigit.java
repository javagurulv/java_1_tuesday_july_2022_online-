package student_sobit_eshniyozov.lesson_4_if_statement.level_2.Task_6;
//        Написать программу, которая запрашивает у пользователя
//         два целых числа и выводит на консоль наименьшее из них.

class SmallerDigit {
    int numberOne;
    int numberTwo;
    SmallerDigit(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    void showSmallerDigit(){
        if (this.numberOne < this.numberTwo) {
            System.out.println("Smaller number is: " + this.numberOne);
        } else if (this.numberOne > this.numberTwo) {
            System.out.println("Smaller numbers is: "+this.numberTwo);
        } else {System.out.println("Numbers are equals");}
    }
}
