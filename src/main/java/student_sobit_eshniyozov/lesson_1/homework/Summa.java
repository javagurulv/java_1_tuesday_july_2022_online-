package student_sobit_eshniyozov.lesson_1.homework;

//      Напишите Java программу, которая выведет на консоль сумму двух чисел.
//      Числа можно придумать любые, их не надо запрашивать у пользователя.
//      Тестовые данные:
//      74 + 36
//      Ожидаемый результат:
//      110
public class Summa {
    public static void main(String[] args) {

        int numberOne = 74;
        int numberTwo = 36;
        int resultSum = numberOne + numberTwo;
        System.out.println("74+36="+resultSum);
        System.out.println("36+74="+resultSum);

/*        -----------------------------------------------------------------
      Write a Java program to divide two numbers and print on the screen.
        Test Data :
        50/3
        Expected Output :
        16
 */
        int numberThree = 50;
        int numberFour = 3;
        int resultDivide = numberThree / numberFour;
        System.out.println("50/3="+resultDivide);

        // Other version
        double numberFive = 50;
        double numberSix = 3;
        double resultDivideVersionTwo = numberFive / numberSix;
        System.out.println("50/3="+resultDivideVersionTwo);
        double resultDivideVersionThree = numberSix / numberFive;
        System.out.println("3/50="+resultDivideVersionThree);
    }
}