package student_levs_blinnikovs.lesson_12_collections.level_1_intern.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ListDemo {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list1.add("Test");
        list1.add("word");
        list1.add(".");

        list2.add("Some");
        list2.add("other");
        list2.add("sentence");
        list2.add(".");

        System.out.println(list1.size());
        System.out.println(list2.contains("sentence"));

    }

}
