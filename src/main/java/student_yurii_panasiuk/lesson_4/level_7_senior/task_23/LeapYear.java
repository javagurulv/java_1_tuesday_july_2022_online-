package student_yurii_panasiuk.lesson_4.level_7_senior.task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class LeapYear {


     boolean isLeapYear(int year) {

         if ((year % 4) == 0 && (year % 100) != 0) {return true;}
            else if ((year % 100) == 0 && (year % 400) == 0) { return true; }
         else { return false; }

     }
 }


    // return true - если год високосный
    // return false - если год обычный

        // Если год не делится на 4, значит он обычный.
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        // Иначе год обычный.