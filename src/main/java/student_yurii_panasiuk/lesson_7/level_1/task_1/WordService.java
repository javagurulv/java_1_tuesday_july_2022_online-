package student_yurii_panasiuk.lesson_7.level_1.task_1;

import java.util.ArrayList;
import java.util.List;

/*     Дана строка с текстом.
        Написать метод, который находит слово
        в тексте встречающееся больше всего раз.

        Если несколько слов в тексте встречаются одинаково
        максимальное число раз, то возвращаем, то слово,
        которое встречается в тексте первым.

  */
class WordService {

     public static void main(String[] args) {

   // public String findMostFrequentWord(String text) {

        String  text = "type text here"; // Дана строка с текстом.

         List<Character> chars = new ArrayList<>();
         for (char ch : text.toCharArray()) {
             chars.add(ch);
         }
         //return chars;
         // System.out.println(chars);



    }

}
