package student_eduard_minajev.lesson_7_encapsulation.level_6_creditcard;


public class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.shouldGiveCreditDebt(120);
    }

    CreditCard card1 = new CreditCard("0000-1111-2222-3333", "0000",0);

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private void shouldGiveCreditDebt (int testValue) {
        int requiredDebt = card1.calculateRequiredDebt(testValue);
        checkTestResult(requiredDebt == 120, "shouldGiveCreditDebt");
    }










}
