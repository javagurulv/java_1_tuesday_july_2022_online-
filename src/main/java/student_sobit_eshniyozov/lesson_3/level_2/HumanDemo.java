package student_sobit_eshniyozov.lesson_3.level_2;

import student_sobit_eshniyozov.lesson_3.level_1.Robot;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class HumanDemo {
    public static void main(String[] args) {
    Human Human = new Human("Sobit");
    Human.seyMyName();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
                String nameOfHuman = scanner.nextLine();

        System.out.println("Hello "+ nameOfHuman +"!");
    }
}
