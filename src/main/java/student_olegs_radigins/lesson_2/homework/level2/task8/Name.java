package student_olegs_radigins.lesson_2.homework.level2.task8;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Name {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);


        System.out.println("Напишите свое имя: ");

        System.out.println("Hello " + name.next());

    }
}
