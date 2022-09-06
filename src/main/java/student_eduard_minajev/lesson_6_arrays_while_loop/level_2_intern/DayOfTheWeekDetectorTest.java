package student_eduard_minajev.lesson_6_arrays_while_loop.level_2_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTest {

    public static void main (String[] args){
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.testMonday();
        test.testTuesday();
        test.testWednesday();
        test.testThursday();
        test.testFriday();
        test.testSaturday();
        test.testSunday();
        test.testWrong();


    }

    // С начала кадый метод занимал 6 строчек, удалось сообразить как сократить код до 4х строк
    public void testMonday (){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realDay = detector.findDayOfTheWeek(1);
        String testResult = ("Monday" == realDay) ? "Monday Ok": "Monday Fail";
        System.out.println(testResult);
    }

    public void testTuesday (){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realDay = detector.findDayOfTheWeek(2);
        String testResult = ("Tuesday" == realDay) ? "Tuesday Ok": "Tuesday Fail";
        System.out.println(testResult);
    }

    public void testWednesday (){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realDay = detector.findDayOfTheWeek(3);
        String testResult = ("Wednesday" == realDay) ? "Wednesday Ok": "Wednesday Fail";
        System.out.println(testResult);
    }

    public void testThursday (){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realDay = detector.findDayOfTheWeek(4);
        String testResult = ("Thursday" == realDay) ? "Thursday Ok": "Thursday Fail";
        System.out.println(testResult);
    }

    public void testFriday (){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realDay = detector.findDayOfTheWeek(5);
        String testResult = ("Friday" == realDay) ? "Friday Ok": "Friday Fail";
        System.out.println(testResult);
    }

    public void testSaturday (){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realDay = detector.findDayOfTheWeek(6);
        String testResult = ("Saturday" == realDay) ? "Saturday Ok": "Saturday Fail";
        System.out.println(testResult);
    }

    public void testSunday (){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realDay = detector.findDayOfTheWeek(7);
        String testResult = ("Sunday" == realDay) ? "Sunday Ok": "Sunday Fail";
        System.out.println(testResult);
    }

    public void testWrong (){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String realDay = detector.findDayOfTheWeek(9);
        String testResult = ("Wrong" == realDay) ? "Wrong Ok": "Wrong Fail";
        System.out.println(testResult);
    }



}

