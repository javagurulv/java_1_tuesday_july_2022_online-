package teacher.lesson_4_if_statement.lessoncode;

class CalculatorTest {

	public static void main(String[] args) {
		CalculatorTest calculatorTest = new CalculatorTest();
		calculatorTest.test1();
		calculatorTest.test2();
		calculatorTest.test3();
		calculatorTest.test4();
	}

	// Test 1: f = -10; s = -3; r = -13
	public void test1() {
		int firstNumber = -10;
		int secondNumber = -3;

		Calculator calculator = new Calculator();
		int actualResult = calculator.sum(firstNumber, secondNumber);

		if (actualResult == -13) {
			System.out.println("TEST 1 = OK");
		} else {
			System.out.println("TEST 1 = FAIL");
		}
	}


	// Test 2: f = 0; s = 0; r = 0
	public void test2() {
		int firstNumber = 0;
		int secondNumber = 0;

		Calculator calculator = new Calculator();
		int actualResult = calculator.sum(firstNumber, secondNumber);

		if (actualResult == 0) {
			System.out.println("TEST 2 = OK");
		} else {
			System.out.println("TEST 2 = FAIL");
		}
	}

	// Test 3: f = 10; s = 20; r = 30
	public void test3() {
		int firstNumber = 10;
		int secondNumber = 20;

		Calculator calculator = new Calculator();
		int actualResult = calculator.sum(firstNumber, secondNumber);

		if (actualResult == 30) {
			System.out.println("TEST 3 = OK");
		} else {
			System.out.println("TEST 3 = FAIL");
		}
	}

	// Test 4: f = 0; s = 20; r = 20
	public void test4() {
		int firstNumber = 0;
		int secondNumber = 20;

		Calculator calculator = new Calculator();
		int actualResult = calculator.sum(firstNumber, secondNumber);

		if (actualResult == 20) {
			System.out.println("TEST 4 = OK");
		} else {
			System.out.println("TEST 4 = FAIL");
		}
	}

}
