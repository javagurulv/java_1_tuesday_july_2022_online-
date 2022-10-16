package student_yurii_panasiuk.lesson_11.level_2_3_.task_4_5_6;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
     String foundDayOfTheWeek;
     DayOfTheWeekDetector dayOfTheWeekDetector;

     DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
         this.dayOfTheWeekDetector = dayOfTheWeekDetector;
     }
     void printFoundDayOfTheWeek() {
          System.out.println (foundDayOfTheWeek);
     }
     void setFoundDayOfTheWeek(String foundDayOfTheWeek) {
         this.foundDayOfTheWeek = foundDayOfTheWeek;
     }
     void run() {
         System.out.println("Enter nember of the day (1-7): ");
         Scanner userInput = new Scanner(System.in);
         int dayNumber = userInput.nextInt();
         setFoundDayOfTheWeek(this.dayOfTheWeekDetector.detectDayName(dayNumber));
         printFoundDayOfTheWeek();
     }
    public static void main(String[] args) {

       DayOfTheWeekDetectorVersion1 detectorIfVersion1 = new DayOfTheWeekDetectorVersion1();
       DayOfTheWeekDetectorDemo version1 = new DayOfTheWeekDetectorDemo(detectorIfVersion1);
       version1.run();

       DayOfTheWeekDetectorVersion1 detectorVersion2 = new DayOfTheWeekDetectorVersion1();
       DayOfTheWeekDetectorDemo version2 = new DayOfTheWeekDetectorDemo(detectorVersion2);
       version2.run();

    }
 }
