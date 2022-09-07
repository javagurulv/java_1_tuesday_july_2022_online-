package student_sobit_eshniyozov.lesson_5_arrays_for_loop.level_2.Task_13;

//        Напишите программу, в которой:
//        - создайте массив целых чисел длиной 10;
//        - заполните каждую ячейку массива случайным числом;
//        - посчитайте сумму всех ячеек и распечатайте ее на консоль.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class GroupFour {
    public static void main(String[] args) {

        int[] group = new int[10];
        int j= 1;

        for (int i = 0; i < group.length; i++) {
            group[i] = ((int)(Math.random() * 222));
            System.out.println((j++)+". "+group[i]);
        }

        int sum = 0;
        for (int i = 0; i < group.length; i++) {
            sum = sum + group[i];
        }
        System.out.println(sum);

    }


}