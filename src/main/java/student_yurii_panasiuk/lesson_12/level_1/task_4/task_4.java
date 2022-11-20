package student_yurii_panasiuk.lesson_12.level_1.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
          Могут ли реализации интерфейса java.util.List хранить одинаковые
        элементы (дубликаты)? Напишите код программы, который демонстрирует
        ответ на этот вопрос.

        элементы это что?
 */

class task_4 {
 public static void main(String[] args) {

 List<Integer> list1 = new ArrayList<Integer>();


//  List<Integer> list1 = new LinkedList<>();  Variable 'list1' is already defined in the scope

    Integer elementA = new Integer(0);
    list1.add (elementA);
    list1.add (elementA);
    list1.add (elementA);

}
}
