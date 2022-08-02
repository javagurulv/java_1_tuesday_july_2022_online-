package student_levs_blinnikovs.lesson_4_if_statement.level_3_junior.task_8;

class ThreeNumComparatorDemo {

    public static void main(String[] args) {

        ThreeNumComparator test1 = new ThreeNumComparator(1,1,1);
        ThreeNumComparator test2 = new ThreeNumComparator(1,2,3);
        ThreeNumComparator test3 = new ThreeNumComparator(1,2,1);

        System.out.println(test1.compareNumbers());
        System.out.println(test2.compareNumbers());
        System.out.println(test3.compareNumbers());

    }

}
