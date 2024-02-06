package student_olegs_radigins.lesson_5.level_5_6.task_31_32_33_34_35;

public class ArrayUtilDemo {
    public static void main(String[] args){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Max number is " + arrayUtil.findMaxNumber(array));
        System.out.println("Min number is " + arrayUtil.findMinNumber(array));

    }
}
