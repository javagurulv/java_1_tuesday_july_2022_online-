package student_sobit_eshniyozov.lesson_5_arrays_for_loop.level_2.Task_10;

class Group {
    public static void main(String[] args) {

        int[] group = new int[10];
        group[0] = 8;
        group[1] = 16;
        group[2] = 24;
        group[3] = 39;
        group[4] = 47;
        group[5] = 58;
        group[6] = 67;
        group[7] = 73;
        group[8] = 82;
        group[9] = 100;

        int sum = group[5] + group[8];
        System.out.println("======== Version one ========");
            System.out.println(sum);
            System.out.println(group[0]);
            System.out.println(group[1]);
            System.out.println(group[2]);
            System.out.println(group[3]);
            System.out.println(group[4]);
            System.out.println(group[5]);
            System.out.println(group[6]);
            System.out.println(group[7]);
            System.out.println(group[8]);
            System.out.println(group[9]);

            System.out.println("======== Version two ========");

        for (int groups : group) {
            System.out.println(groups);
        }
    }
}
