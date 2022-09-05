package student_ernest_aleskevics.lesson_6.level_1.task_6;

public class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.testNumberUtils(6);
    }

    private void testNumberUtils (int number){
        if (number % 2 == 0){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }
}
