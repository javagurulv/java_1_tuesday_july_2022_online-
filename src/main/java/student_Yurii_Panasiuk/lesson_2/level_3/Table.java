package student_Yurii_Panasiuk.lesson_2.level_3;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(Number + " * " + i + " = " + Number*i);
        }

}
}