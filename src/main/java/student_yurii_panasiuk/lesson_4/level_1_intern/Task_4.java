package student_yurii_panasiuk.lesson_4.level_1_intern;

import java.util.Scanner;

 class Task_4 {

    public static void main(String[] args) {
        System.out.println("Введите чило");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        if ((number % 2) == 0) { System.out.println("вы ввели четное число"); }

        else { System.out.println("вы ввели нечетное число"); }
    }

}
