package student_levs_blinnikovs.lesson_12_collections.level_1_intern.task_2;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ListDemo2 {

    public static void main(String[] args) {

        List<String> objectList = new ArrayList<>();
        objectList.add("String");
        objectList.add(".");
        System.out.println(objectList.indexOf("String"));

        //List<char> charList = new ArrayList<>();

    }

}
