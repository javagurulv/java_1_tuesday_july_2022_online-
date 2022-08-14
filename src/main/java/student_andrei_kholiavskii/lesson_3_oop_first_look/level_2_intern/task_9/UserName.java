package student_andrei_kholiavskii.lesson_3_oop_first_look.level_2_intern.task_9;

import java.util.Scanner;

class UserName {

    public static void main(String[] args){

        Scanner name = new Scanner(System.in);

        System.out.println("Please, enter your name: ");

        String userName = name.nextLine();

        System.out.println("Hello " + userName + "!");

    }
}
