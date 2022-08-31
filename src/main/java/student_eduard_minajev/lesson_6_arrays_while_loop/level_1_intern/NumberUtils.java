/* Напишите тесты для проверки метода isEven(int number).
Упростите работу метода, код внутри может быть написан в одну строку.

class NumberUtils {

    public boolean isEven(int number) {
         if (number % 2 == 0) {
             return true;
         } else {
             return false;
         }
    }

}*/

package student_eduard_minajev.lesson_6_arrays_while_loop.level_1_intern;

// Буду честен, гуглил вопрос :) Пишут, что нужно тернарный оператор исспользовать.

public class NumberUtils {

// метод записан
    public boolean isEven(int number) {return (number % 2 == 0) ? true : false;}

}




