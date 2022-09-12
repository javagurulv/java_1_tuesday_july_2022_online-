package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_12;

class ArrayCopyDemo {
    public static void main(String[] args) {

        ArrayCopy arrayCopy = new ArrayCopy();

        int[] in = {0, 1, 2, 3, 4};
        int numberFrom = 1;
        int numberTo = 3;

        int[] result = arrayCopy.copyInRange(in, numberFrom, numberTo);
        for (int j : result) {
            System.out.println(j);
        }


    }
}
