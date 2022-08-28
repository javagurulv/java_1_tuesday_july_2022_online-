package student_yurii_panasiuk.lesson_6.level_2_intern;

 class DayOfTheWeekDetectorTest {

     public static void main(String[] args) {
     DayOfTheWeekDetector detector = new DayOfTheWeekDetector();

     System.out.print("DayOfTheWeekDetector test - ");
     testResult (detector.findDayOfTheWeek(1).equals("Monday") &&
                       detector.findDayOfTheWeek(2).equals("Tuesday") &&
                       detector.findDayOfTheWeek(3).equals("Wednesday") &&
                       detector.findDayOfTheWeek(4).equals("Thursday") &&
                       detector.findDayOfTheWeek(5).equals("Friday") &&
                       detector.findDayOfTheWeek(6).equals("Saturday") &&
                       detector.findDayOfTheWeek(7).equals("Sunday") &&
                       detector.findDayOfTheWeek(8).equals("Not correct day number") );
     }
    static void testResult(boolean check) {
        if (check){ System.out.println(" OK");}
        else {System.out.println(" FAIL");}
    }

 }