package student_olegs_radigins.lesson_12.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> demo = new ArrayList<>();
        //Продемонстрируйте как:
        //- добавить в список элемент (в начало и в конец)
        demo.add(0, 11);
        demo.add(22);
        demo.add(33);
        demo.add(44);
        System.out.println(demo);


        //        - узнать длину списка
        System.out.println(demo.size());


        //- удалить элемент из списка (по индексу и без)
        demo.remove(0);
        demo.remove(demo.size()-1);
        System.out.println(demo);


        //        - узнать пустой список или нет
        System.out.println(demo.isEmpty());


        //- обойти список и вывести на консоль каждый элемент.
        for (int i = 0; i < demo.size(); i++) {
            System.out.println(demo.get(i));
        }
    }
}
