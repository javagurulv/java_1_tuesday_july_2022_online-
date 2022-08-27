/* Найдите синтаксическую ошибку в программе и исправьте её:

class ForLoopDefinition1 {

    public static void main(String[] args) {
        for (int i; i < 10; i++) {
            System.out.println(i);
        }
    }

} */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_3_junior;

public class Task16 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {  // отсутвие инициализации
            System.out.println(i);
        }
    }

}
