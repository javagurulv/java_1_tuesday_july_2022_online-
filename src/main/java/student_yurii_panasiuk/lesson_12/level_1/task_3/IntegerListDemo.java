package student_yurii_panasiuk.lesson_12.level_1.task_3;

import java.util.ArrayList;

public class IntegerListDemo {

    public static void main(String[] args) {
            Integer intNumber_0 = new Integer(0);
            Integer intNumber_1 = new Integer(1);
            Integer intNumber_2 = new Integer(2);
            Integer intNumber_3 = new Integer(3);
            Integer intNumber_4 = new Integer(4);

        ArrayList<Integer> integerslist = new ArrayList<Integer>();

        integerslist.add(intNumber_1);
        integerslist.add(intNumber_2);
        integerslist.add(intNumber_3);
        integerslist.add(intNumber_4);
        integerslist.add(0,intNumber_0);

        int arrayListSize = integerslist.size();
        System.out.println("\n" + arrayListSize);

        System.out.println("\n" + integerslist.toString());
        integerslist.remove(0); // удалить элемент из списка по индексу
        System.out.println(integerslist.toString());

        System.out.println("\n" + integerslist.toString());
        integerslist.remove(intNumber_2); // удалить элемент из списка по ссылке
        System.out.println(integerslist.toString());

        isEmpty(integerslist);

        for (Integer number : integerslist) {
            System.out.print("\n" + number);
            }

    }

    static void isEmpty (ArrayList<Integer> list)  {
        if (list.isEmpty()) {
            System.out.println("\n The ArrayList is empty");
        } else {
            System.out.println("\n The ArrayList is not empty");
        }
    }

}


