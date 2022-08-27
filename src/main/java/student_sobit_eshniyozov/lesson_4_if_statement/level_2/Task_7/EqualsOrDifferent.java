package student_sobit_eshniyozov.lesson_4_if_statement.level_2.Task_7;
//        Написать программу, которая запрашивает у пользователя
//        два целых числа и выводит на консоль:
//        - "Numbers are equals" - если числа равны
//        - "Numbers are different" - если числа не равны
public class EqualsOrDifferent {
    int numberOne;
    int numberTwo;
    EqualsOrDifferent(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    void showEqualsOrDifferent(){
        if (this.numberOne == this.numberTwo) {
            System.out.println("Numbers are equals!");
        } else {
            System.out.println("Numbers are different!");
        }
    }
}
