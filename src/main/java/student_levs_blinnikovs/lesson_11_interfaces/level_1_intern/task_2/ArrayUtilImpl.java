package student_levs_blinnikovs.lesson_11_interfaces.level_1_intern.task_2;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilImpl implements ArrayUtil {

    @Override
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    @Override
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
        }
    }

    @Override
    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public Optional<Integer> findMaxNumber(int[] array) {
        OptionalInt max = Arrays.stream(array).max();
        if(max.isPresent()) {
            return Optional.of(max.getAsInt());
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Integer> findMinNumber(int[] array) {
        OptionalInt min = Arrays.stream(array).min();
        if(min.isPresent()) {
            return Optional.of(min.getAsInt());
        } else {
            return Optional.empty();
        }

    }

}
