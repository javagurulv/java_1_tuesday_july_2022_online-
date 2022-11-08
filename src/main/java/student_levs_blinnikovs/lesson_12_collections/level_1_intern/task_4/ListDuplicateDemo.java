package student_levs_blinnikovs.lesson_12_collections.level_1_intern.task_4;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Duplicate {

    public Duplicate() {
    }
}

class ListDuplicateDemo {

    public static void main(String[] args) {

        Duplicate duplicate = new Duplicate();

        List<Duplicate> duplicates = new ArrayList<>();
        duplicates.add(duplicate);
        duplicates.add(duplicate);
        duplicates.add(duplicate);

        System.out.println(duplicate.equals(duplicate));
        System.out.println(duplicates.size()); // может

    }

}
