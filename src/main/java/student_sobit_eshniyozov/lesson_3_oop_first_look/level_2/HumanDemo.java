package student_sobit_eshniyozov.lesson_3_oop_first_look.level_2;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class HumanDemo {
    public static void main(String[] args) {
    Human Human = new Human("Sobit");
    Human.seyMyName();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
                String nameOfHuman = scanner.nextLine();

        System.out.println("Hello "+ nameOfHuman +"!");
    }
}
