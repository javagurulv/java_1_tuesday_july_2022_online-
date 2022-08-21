package student_yurii_panasiuk.lesson_4.level_7_senior.task_24;

 class CalculatorTest {

  public static void main(String[] args) {
   CalculatorTest calculatorTest = new CalculatorTest();
   calculatorTest.sumTest();
   calculatorTest.subTest();
   calculatorTest.mulTest();
   calculatorTest.divTest();
   calculatorTest.isEvenTest1();
   calculatorTest.isEvenTest2();

  }

   void testResult (boolean check) {

   if (check){ System.out.println("test = OK");}
   else {System.out.println("test = FAIL");}

  }

  public void sumTest() {
   int firstNumber = 35;
   int secondNumber = 40;
   Calculator calculator = new Calculator();
   int result = calculator.sum(firstNumber, secondNumber);
   testResult(result == 75);

  }

  public void subTest() {
   int firstNumber = 35;
   int secondNumber = 15;
   Calculator calculator = new Calculator();
   int result = calculator.sub(firstNumber, secondNumber);
   testResult(result == 20);
  }

  public void mulTest() {
   int firstNumber = 5;
   int secondNumber = 5;
   Calculator calculator = new Calculator();
   int result = calculator.mul(firstNumber, secondNumber);
   testResult(result == 25);
   }


  public void divTest() {
   int firstNumber = 40;
   int secondNumber = 8;
   Calculator calculator = new Calculator();
   int result = calculator.div(firstNumber, secondNumber);
   testResult(result == 5);
  }

  public void isEvenTest1() {
   Calculator calculator = new Calculator();
   boolean result = calculator.isEven(40);
   testResult(result);
  }
   public void isEvenTest2 () {
    Calculator calculator = new Calculator();
    boolean result = calculator.isEven(41);
    testResult(!result);
   }

  }
