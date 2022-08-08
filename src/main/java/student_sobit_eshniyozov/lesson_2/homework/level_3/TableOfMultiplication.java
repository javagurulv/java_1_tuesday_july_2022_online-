package student_sobit_eshniyozov.lesson_2.homework.level_3;

import java.util.Scanner;

public class TableOfMultiplication {


    static void TableOfMultiplication(int nomberOne) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(nomberOne + " x " + i + " = " + i * nomberOne);
        }
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Naberite sifru:");
        int userNomberOne;
        userNomberOne = userInput.nextInt();

        System.out.println("rezultat: ");
        TableOfMultiplication(userNomberOne);
    }
}