package student_ernest_aleskevics.lesson_6.level_2;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();
        test.notCorrectDayNumber();
    }

    public void shouldReturnMonday() {
        DayOfTheWeekDetector detectorMonday = new DayOfTheWeekDetector();
        String dayOfTheWeek = detectorMonday.findDayOfTheWeek(1);
        checkTestResult("Monday".equals(dayOfTheWeek), "Monday test");
    }

    public void shouldReturnTuesday(){
        DayOfTheWeekDetector detectorTuesday = new DayOfTheWeekDetector();
        String dayOfTheWeek = detectorTuesday.findDayOfTheWeek(2);
        checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday test");
    }

    public void shouldReturnWednesday(){
        DayOfTheWeekDetector detectorWednesday = new DayOfTheWeekDetector();
        String dayOfTheWeek = detectorWednesday.findDayOfTheWeek(2);
        checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday test");
    }

    public void shouldReturnThursday(){
        DayOfTheWeekDetector detectorThursday = new DayOfTheWeekDetector();
        String dayOfTheWeek = detectorThursday.findDayOfTheWeek(4);
        checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday test");
    }

    public void shouldReturnFriday(){
        DayOfTheWeekDetector detectorFriday = new DayOfTheWeekDetector();
        String dayOfTheWeek = detectorFriday.findDayOfTheWeek(5);
        checkTestResult("Friday".equals(dayOfTheWeek), "Friday test");
    }

    public void shouldReturnSaturday(){
        DayOfTheWeekDetector detectorSaturday = new DayOfTheWeekDetector();
        String dayOfTheWeek = detectorSaturday.findDayOfTheWeek(6);
        checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday test");
    }

    public void shouldReturnSunday(){
        DayOfTheWeekDetector detectorSunday = new DayOfTheWeekDetector();
        String dayOfTheWeek = detectorSunday.findDayOfTheWeek(7);
        checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday test");
    }

    public void notCorrectDayNumber(){
        DayOfTheWeekDetector detectorWrongDayNumber = new DayOfTheWeekDetector();
        String dayOfTheWeek = detectorWrongDayNumber.findDayOfTheWeek(8);
        checkTestResult("Not correct day number".equals(dayOfTheWeek), "Bug test");
    }


    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
