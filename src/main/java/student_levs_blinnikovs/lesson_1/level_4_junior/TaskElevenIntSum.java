package student_levs_blinnikovs.lesson_1.level_4_junior;

/*
Напишите Java программу, которая выведет на консоль сумму двух чисел.
Числа можно придумать любые, их не надо запрашивать у пользователя.

Тестовые данные:
74 + 36
Ожидаемый результат:
110

 */

public class TaskElevenIntSum {

    // Input
    static int var1 = 74;
    static int var2 = 36;

    // Function returns sum of 2 integer values
    public static int intSum(int int1, int int2) {
        return int1 + int2;
    }

    public static void main(String[] args) {
        System.out.println("Result of sum: " + intSum(var1, var2));
    }
}
