package student_olegs_radigins.lesson_4.level_1.task_4;

import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int enteredNumber = scanner.nextInt();
        if(enteredNumber%2 == 0){
            System.out.println("You entered an even number.");
        }else {
            System.out.println("You entered an odd number.");
        }
    }
}
