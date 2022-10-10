package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PremiumCalculatorTest {

    private void printTestResult(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK.");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    void shouldCalculateLowRisk() {
        ArrayList<SubObject> subObjects = new ArrayList<>();
        SubObject television = new SubObject("TV", new BigDecimal("100.00"), List.of(RiskType.FIRE));
        SubObject computer = new SubObject("Computer", new BigDecimal("8.00"), List.of(RiskType.THEFT));
        subObjects.add(television);
        subObjects.add(computer);

        ArrayList<Object> objects = new ArrayList<>();
        Object house = new Object(subObjects);
        objects.add(house);

        Policy policy = new Policy(objects);
        PremiumCalculator calculator = new PremiumCalculator();

        BigDecimal realPremiumResult = calculator.calculate(policy).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal expectedPremiumResult = new BigDecimal("2.28");

        printTestResult(expectedPremiumResult.equals(realPremiumResult));
    }

    void shouldCalculateHighRisk() {
        ArrayList<SubObject> subObjects = new ArrayList<>();
        SubObject television = new SubObject("TV", new BigDecimal("500.00"), List.of(RiskType.FIRE));
        SubObject computer = new SubObject("Computer", new BigDecimal("102.51"), List.of(RiskType.THEFT));
        subObjects.add(television);
        subObjects.add(computer);

        ArrayList<Object> objects = new ArrayList<>();
        Object house = new Object(subObjects);
        objects.add(house);

        Policy policy = new Policy(objects);
        PremiumCalculator calculator = new PremiumCalculator();

        BigDecimal realPremiumResult = calculator.calculate(policy).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal expectedPremiumResult = new BigDecimal("17.13");

        printTestResult(expectedPremiumResult.equals(realPremiumResult));
    }

    public static void main(String[] args) {

        PremiumCalculatorTest test = new PremiumCalculatorTest();

        test.shouldCalculateLowRisk();
        test.shouldCalculateHighRisk();

    }

}
