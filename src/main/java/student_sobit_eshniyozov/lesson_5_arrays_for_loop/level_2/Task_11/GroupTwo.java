package student_sobit_eshniyozov.lesson_5_arrays_for_loop.level_2.Task_11;

import java.util.Scanner;

class GroupTwo {
    public static void main(String[] args) {

        int[] group = new int[10];
        int i = 0;
        int j = 0;
        Scanner scanner = new Scanner(System.in);

        for (int element : group) {
            System.out.println("Write " + (i + 1) + " number of array:");
            group[i] = scanner.nextInt();
            i++;
        }
        for (int groups : group) {
            System.out.println((1+j++)+" number is: "+groups);
        }
    }
}
