package student_yurii_panasiuk.lesson_7.level_1.task_1;

public class WordServiceDemo {

    public static void main(String[] args) {

        WordService test = new WordService();

    String  text = "qw er"; // Дана строка с текстом.

        System.out.println(test.StringToList (text));

       // System.out.println ( test.DivIntoWords (test.StringToList (text)));

        test.DivIntoWords (test.StringToList (text));





}
}
