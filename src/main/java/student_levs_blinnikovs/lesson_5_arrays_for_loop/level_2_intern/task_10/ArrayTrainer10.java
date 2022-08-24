package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_2_intern.task_10;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива любым целым числом;
 - выведите значение каждой ячейки на консоль.
 */

class ArrayTrainer10 {
    public static void main(String[] args) {

        int[] numArray = new int[3];

        numArray[0] = 1;
        numArray[1] = 100;
        numArray[2] = 1000;

        for (int i : numArray) {
            System.out.println(i);
        }
    }
}
