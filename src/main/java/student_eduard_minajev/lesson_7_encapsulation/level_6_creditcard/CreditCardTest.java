package student_eduard_minajev.lesson_7_encapsulation.level_6_creditcard;


public class CreditCardTest {

    public static void main(String[] args) {
    CreditCardTest test = new CreditCardTest();
    test.shouldAdd100ToDeposit();
    test.shouldAdd80ToDeposit();
    /* test.shouldGetPinOK();
    test.shouldGetPinNo(); */

    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    CreditCard creditCard1 = new CreditCard(2222-333-5555-6666,0000,00.00,00.00,00.00);
    CreditCard creditCard2 = new CreditCard(9999-0012-2542-4341, 1123,00.00,00.00,20.00);

    public void shouldGetPinOK () {
        CreditCard creditCard1 = new CreditCard(2222-333-5555-6666,0000,00.00,00.00,00.00);
        boolean checkResult = creditCard1.checkPin();
        checkTestResult(checkResult == true, "shouldGetPinOK");
    }

    public void shouldGetPinNo () {
        System.out.println("Please enter Pin other than 0000");
        CreditCard creditCard1 = new CreditCard(2222-333-5555-6666,0000,00.00,00.00,00.00);
        boolean checkResult = creditCard1.checkPin();
        checkTestResult(checkResult == false, "shouldGetPinNo");
    }


    public void shouldAdd100ToDeposit (){
        System.out.println("Please Please enter deposit value 100.00!");
        CreditCard creditCard1 = new CreditCard(2222-333-5555-6666,0000,00.00,00.00,00.00);
        double realDeposit = creditCard1.deposit();
        checkTestResult(realDeposit==100, "shouldAdd100ToDeposit");
    }

    public void shouldAdd80ToDeposit (){
        System.out.println("Please enter deposit value 100.00!");
        CreditCard creditCard2 = new CreditCard(9999-0012-2542-4341, 1123,00.00,00.00,20.00);
        double realDeposit = creditCard2.deposit();
        checkTestResult(realDeposit==80, "shouldAdd80ToDeposit");
    }




}
