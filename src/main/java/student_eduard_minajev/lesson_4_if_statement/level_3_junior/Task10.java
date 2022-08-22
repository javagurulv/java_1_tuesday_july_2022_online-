package student_eduard_minajev.lesson_4_if_statement.level_3_junior;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task10 {

    public static void main(String[] args){
        System.out.println("Please enter first number!");
        Scanner numberA = new Scanner(System.in);
        int numberOne = numberA.nextInt();

        System.out.println("Please enter second number");
        Scanner numberB = new Scanner(System.in);
        int numberTwo = numberB.nextInt();

        System.out.println("Please enter third number");
        Scanner numberC = new Scanner(System.in);
        int numberThree = numberC.nextInt();

        /* 1) A > B & A > C => A (done)
        * 2) A < B & B > C => B (done)
        * 3) A < B & B < C => C (done)
        * 4) A == B & B == C => A (done)
        * 5) A == B & B > C => A (done)
        * 6) A == B & B < C => C (done)
        * 7) A == C & C > B => A (done)
        * 8) A == C & C < B => B (done)
        * 9) A > B & C > A => C (done)
        * 10) A > B & A > C =>A (done)
        * вроде ничего не забыл...  */


        if ((numberOne > numberTwo) && (numberTwo > numberThree)){
            System.out.println(numberOne);
        } else if ((numberOne < numberTwo) && (numberTwo > numberThree)) {
            System.out.println(numberTwo);

        } else if (((numberOne < numberTwo) && (numberTwo < numberThree))) {
            System.out.println(numberThree);

        } else if (((numberOne == numberTwo) && (numberTwo == numberThree))) {
            System.out.println(numberOne);

        } else if (((numberOne == numberTwo) && (numberTwo > numberThree))) {
            System.out.println(numberOne);
        } else if (((numberOne == numberTwo) && (numberTwo < numberThree))) {
            System.out.println(numberThree);
        } else if (((numberOne == numberThree) && (numberTwo > numberThree))) {
            System.out.println(numberTwo);
        } else if (((numberOne == numberThree) && (numberTwo < numberThree))) {
            System.out.println(numberOne);
        } else if (((numberOne > numberTwo) && (numberOne < numberThree))) {
            System.out.println(numberThree);
        } else if (((numberOne > numberTwo) && (numberOne > numberThree))) {
            System.out.println(numberOne);
        }

    }


    }



