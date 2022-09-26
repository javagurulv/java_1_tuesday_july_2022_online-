package student_yurii_panasiuk.lesson_7.level_1_2_3.task_1_2_3_4;


import java.util.*;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

/*     Дана строка с текстом.
        Написать метод, который находит слово
        в тексте встречающееся больше всего раз.

        Если несколько слов в тексте встречаются одинаково
        максимальное число раз, то возвращаем, то слово,
        которое встречается в тексте первым.
  */
@CodeReview(approved = true)
@CodeReviewComment(teacher = "Теперь бы из отдельных методов собрать полный алгоритм.")
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_7_encapsulation/codereview/CleanCodeWarning_2.txt")
class WordService {

    String [] processing (String text) {
        String[] words = text.replaceAll("[-.?!)(,:]", "").split("\\s+");
      return  words;
           }

    ArrayList<Integer> listOfResps (String []words){ // создаем список, вместо слов - количество повторений слова
               int reps = 0;
               ArrayList<Integer> listOfReps = new ArrayList<Integer>();
                 for (int i = 0; i < words.length; i++) {
                   reps = 0;
                   for (int j = 0; j < words.length; j++) {
                       if (words[i].equals(words[j])) {
                           reps++;
                       }
                   }
                  listOfReps.add (reps);
                 }
             return listOfReps;
    }

    Integer findMaxCoordinates (List<Integer> listOfReps){
        int maxCoordinates = 0;
        for (int i = 0; i < listOfReps.size(); i++) {
                if(listOfReps.get(i) > listOfReps.get(maxCoordinates)) {
                    maxCoordinates = i;
                }
        }
        return maxCoordinates;
    }

    String findMostFrequentWord (int maxCoordinates, String [] words){
        return words[maxCoordinates];
    }
}
