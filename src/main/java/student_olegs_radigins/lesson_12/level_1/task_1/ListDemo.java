package student_olegs_radigins.lesson_12.level_1.task_1;


import java.util.*;

class ListDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();


        list1.add("Hello");
        list1.add(" ");
        list1.add("world");
        list1.remove(1);

        list2.add("List");
        list2.add(" ");
        list2.add("size");
        list2.add("is");


        System.out.println(list1);
        System.out.println(list1.get(0) + list2.get(1) + list1.get(1));
        System.out.println(list2.get(0) + list2.get(1) + list2.get(2) +
                list2.get(1) + list2.get(3) + list2.get(1) + list2.size());

    }
}
