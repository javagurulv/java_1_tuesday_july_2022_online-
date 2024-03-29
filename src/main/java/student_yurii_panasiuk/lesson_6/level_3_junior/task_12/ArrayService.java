package student_yurii_panasiuk.lesson_6.level_3_junior.task_12;

 /*       Создайте класс ArrayService и реализуйте в нём метод
        для проверки содержит ли массив целых чисел заданное число.

  */

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Посмотри src/main/java/teacher/lesson_6_arrays_while_loop/codereview/CleanCodeWarning_6.txt")
 class ArrayService {
     int givenNumber;
     int[] array = new int[givenNumber];

     ArrayService(int[] array, int givenNumber) {
         this.array = array;
         this.givenNumber = givenNumber;
     }

     boolean checkForNumber()   {
         boolean result = false;
           for (int j : this.array) {
               if (j == this.givenNumber) {
                   result = true;
                   break;
               }
             }
         return result;
         }


 }
