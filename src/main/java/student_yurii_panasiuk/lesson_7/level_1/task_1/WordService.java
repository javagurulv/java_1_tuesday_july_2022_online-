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

        void wordCounter (String text){
            int wordStart = 0;
            int wordEnd = 0;
            //int i = 0;
            List words = new ArrayList<>();
            List<Character> chars = new ArrayList<>();

            for (char ch: text.toCharArray()) {
                chars.add(ch);        }



            if(chars.size() != 0){

                for (int i = 0; i < chars.size(); i++) {
                    if(text.charAt(i) == ' '){
                       wordEnd = i;
                        System.out.println(i);
                        for (int j = wordStart; j <= wordEnd; j++) {
                           System.out.println(wordStart);
                           System.out.println(wordEnd);
                          words.add(chars.get(j));
                        }
                        wordStart = i+1;
                    }
                }
            }

          System.out.println(words);


        }

}
