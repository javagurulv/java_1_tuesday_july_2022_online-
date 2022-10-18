package student_levs_blinnikovs.lesson_11_interfaces.level_1_intern.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface MyList {

    void add(int element);

    void remove(int element);

    void increaseListLength(int byElementCount); // private + do something with add

    void decreaseListLength(int byElementCount); // private + do something with remove

    void swap(int elementToSwap, int elementToSwapWith);

    void sortAsc();

    void sortDesc();

    void findMax(); // just for ints?

    void findMin();  // just for ints?

    void findSum(); // just for ints?

}
