package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayCopy {

    private boolean elementMatchesRule(int[] array, int index, int numberFrom, int numberTo) {
        return (array[index] >= numberFrom) && (array[index] <= numberTo);
    }

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] temporaryResult = new int[in.length];
        int resultArrayLength = 0;
        for (int i = 0; i < in.length; i++) {
            if (elementMatchesRule(in, i, numberFrom, numberTo)) {
                resultArrayLength++;
                temporaryResult[i] = in[i]; // TODO so here is some problem. It has to be the value that matches the rule, not i-th element,
                                            // I don't understand how to do it now. Another loop...
                }
            }


        int[] result = new int[resultArrayLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = temporaryResult[i];
        }
        return result;
    }

}
