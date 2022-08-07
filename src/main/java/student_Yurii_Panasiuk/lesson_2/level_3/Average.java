package student_Yurii_Panasiuk.lesson_2.level_3;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        System.out.println("enter 3 integers");
        Scanner scanner = new Scanner(System.in);
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            int thirdNumber = scanner.nextInt();

        double average =((double)firstNumber+(double)secondNumber+(double)thirdNumber)/3;  // походу вычисления среднего преобразовываем int to double

        System.out.println("The calculated arithmetic mean is " + average);
       
}
}
