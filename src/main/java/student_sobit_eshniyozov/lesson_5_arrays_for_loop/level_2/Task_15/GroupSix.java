package student_sobit_eshniyozov.lesson_5_arrays_for_loop.level_2.Task_15;

//        Напишите программу, в которой:
//        - создайте массив целых чисел длиной 10;
//        - заполните каждую ячейку массива случайным числом;
//        - выведите значение каждой ячейки на консоль;
//        - увеличьте значение каждой ячейки на 2;
//        - выведите значение каждой ячейки на консоль.

class GroupSix {
    public static void main(String[] args) {

        int[] group = new int[10];
        int j= 1;

        for (int i = 0; i < group.length; i++) {
            group[i] = ((int)(Math.random() * 222));
            System.out.println((j++)+". "+group[i]);
        }
    System.out.println("=======================");
        for (int i = 0; i < group.length; i++) {
            group[i] = group[i] + 2;
            System.out.println((j++-10)+". "+group[i]);
        }
    }
}
