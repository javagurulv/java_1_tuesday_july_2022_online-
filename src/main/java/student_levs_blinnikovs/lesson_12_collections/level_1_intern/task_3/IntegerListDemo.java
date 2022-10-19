package student_levs_blinnikovs.lesson_12_collections.level_1_intern.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

//      - добавить в список элемент (в начало и в конец)
        list.add(0);                        // начало
        list.add(list.size(), 1);   // конец
        System.out.println("Element at index 1 is: " + list.get(1));
        System.out.println("Index of element \"1\" is: " + list.indexOf(1));

//        - узнать длину списка
        System.out.println("List size is: " + list.size());

//        - удалить элемент из списка (по индексу и без)
        list.remove(0);
        System.out.println("After removing \"0\" at index 0 remains one element: " + (list.size() == 1));
        list.remove((Object)1);  // без этого каста всё время ожидает подачу индекса
        System.out.println("List empty after removal of last remaining element: " + (list.size() == 0));

//        - узнать пустой список или нет
        System.out.println("List is empty now: " + (list.isEmpty()));

//        - обойти список и вывести на консоль каждый элемент.
        list.add(0);
        list.add(1);
        list.add(2);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

}
