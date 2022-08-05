package student_levs_blinnikovs.lesson_2_variables.level_7_senior.task_29;

// Исправьте ошибки компиляции в данной программе.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SumTwoNumbers {

    public static void main(String[] args) {

        int numberOne = 0;
        int numberTwo = 0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        numberOne = 10;
        numberTwo = 20;

        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }

}

/*
    Цель этого задания: обратить ваше внимание на то,
        что в языке программирования Java использовать
        переменные нельзя до тех пор пока
        им не будет присвоено начальное значение.
 */