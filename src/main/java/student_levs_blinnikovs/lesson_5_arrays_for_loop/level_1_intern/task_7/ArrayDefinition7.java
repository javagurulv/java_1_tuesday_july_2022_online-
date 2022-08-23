package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_1_intern.task_7;

//Найдите ошибку в программе и исправить её:

class ArrayLength7 {  // тут поменял на 7 но это не ошибка

    public static void main(String[] args) {
        int[] numbers = new int[2];    // тут поменял ссылку на массив целых чисел
        System.out.println(numbers[0]);  // тут с -1 будет out of boundaries. Массив начинается с 0
    }

}

