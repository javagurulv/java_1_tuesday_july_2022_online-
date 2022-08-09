package student_sobit_eshniyozov.lesson_1.homework;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Multiply {
    public static void main(String[] args) {
    /*
    Напишите Java программу, которая выведет на консоль результат умножения двух чисел.
    Числа можно придумать любые, их не надо запрашивать у пользователя.

    Тестовые данные:
    50 * 3
    Ожидаемый результат:
    150
    */
        int numberFifty = 50;
        int numberTwo = 2;
        int numberThree = 3;
        int result = numberFifty * numberThree;
        System.out.println("50*3="+result);

        //additional
        int resultTwo = numberThree * numberTwo;
        System.out.println("3*2="+resultTwo);
        int resultThree = numberTwo * numberThree;
        System.out.println("2*3="+resultTwo);
    }
}
