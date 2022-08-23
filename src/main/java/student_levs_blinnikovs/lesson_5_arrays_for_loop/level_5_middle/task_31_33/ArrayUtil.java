package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_5_middle.task_31_33;

/*
Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.
 */

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public void fillArrayWithRandomNumbers(int[] array, int maxRandom) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxRandom);
        }
    }

}
