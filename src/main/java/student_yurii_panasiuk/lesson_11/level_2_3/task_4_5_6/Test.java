package student_yurii_panasiuk.lesson_11.level_2_3.task_4_5_6;

import java.util.List;
import java.util.function.Consumer;

class Test {
     public static void main(String[] args) {

         List<String> testReturn = List.of(
                 "Monday",
                 "Tuesday",
                 "Wednesday",
                 "Thursday",
                 "Friday",
                 "Saturday",
                 "Sunday",
                 "Please input a valid number between 1 and 7");
         List<Integer> testInput = List.of(
                 1,
                 2,
                 3,
                 4,
                 5,
                 6,
                 7,
                 0);

         Consumer<Boolean> printTestResult = check -> {   // функциональный интерфейс - интерфейс с одним абстрактным методом
             if (check) {
                 System.out.println(" OK");
             } else {
                 System.out.println(" FAIL");
             }
         };

        for (int i = 0; i < testInput.size(); i++) {
        System.out.print(" Test 1 case " + (i+1) + " is ");
//      testResult (answersComparator1(testInput, testReturn));
        printTestResult.accept(answersComparator1(testInput, testReturn));
         }

        for (int i = 0; i < testInput.size(); i++) {
        System.out.print(" Test 2 case " + (i+1) + " is ");
//      testResult (answersComparator2(testInput, testReturn));
        printTestResult.accept(answersComparator2(testInput, testReturn));
         }


     }

    static boolean answersComparator1 (List<Integer> input, List<String> answer) {

            int trstcounter = 0;
            for (int i = 0; i < answer.size(); i++) {
                DayOfTheWeekDetectorVersion1 detectorIfVersion1 = new DayOfTheWeekDetectorVersion1();
                    // или третий входящий параметр сделать
                    if (detectorIfVersion1.detectDayName(input.get(i)).equals(answer.get(i))) {
                        trstcounter++;
                    }
            }
        return trstcounter == input.size();
    }

    static boolean answersComparator2 (List<Integer> input, List<String> answer) {

        int trstcounter = 0;
        for (int i = 0; i < answer.size(); i++) {
            DayOfTheWeekDetectorVersion2 detectorIfVersion2 = new DayOfTheWeekDetectorVersion2();
                // или третий входящий параметр сделать
                if (detectorIfVersion2.detectDayName(input.get(i)).equals(answer.get(i))) {
                    trstcounter++;
                }
        }
      return trstcounter == input.size();
    }
  /*
    static void testResult(boolean check) {   // заменил это функциональным интерфейсом Consumer
        if (check) {
            System.out.println(" OK");
        } else {
            System.out.println(" FAIL");
        }
     }

   */
}




