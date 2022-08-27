package student_sobit_eshniyozov.lesson_4_if_statement.level_2.Task_5;

//        Написать программу, которая запрашивает у пользователя
//        два целых числа и выводит на консоль наибольшее из них.
//        Нельзя пользоваться классом Math, можно использовать только if else.
import java.util.Scanner;
class BiggerDigit {
    int numberOne;
    int numberTwo;
    BiggerDigit(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    void showBiggerDigit(){
        if (this.numberOne > this.numberTwo) {
            System.out.println("Bigger number is: " + this.numberOne);
        } else if (this.numberOne < this.numberTwo) {
            System.out.println("Bigger numbers is: "+this.numberTwo);
        } else {System.out.println("Numbers are equals");}
    }
}
