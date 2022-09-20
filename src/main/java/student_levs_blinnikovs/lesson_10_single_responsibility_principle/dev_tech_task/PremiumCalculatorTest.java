package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


class PremiumCalculatorTest {

    private void printTestResult(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK.");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    void shouldCalculateLowRisk() {
        ArrayList<RiskSubItem> riskSubItems = new ArrayList<>();
        RiskSubItem television = new RiskSubItem("TV", new BigDecimal("100.00"), RiskType.FIRE);
        RiskSubItem computer = new RiskSubItem("Computer", new BigDecimal("8.00"), RiskType.THEFT);
        riskSubItems.add(television);
        riskSubItems.add(computer);

        ArrayList<RiskItem> riskItems = new ArrayList<>();
        RiskItem house = new RiskItem(riskSubItems);
        riskItems.add(house);

        Policy policy = new Policy(riskItems);
        PremiumCalculator calculator = new PremiumCalculator();

        BigDecimal realPremiumResult = calculator.calculate(policy).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal expectedPremiumResult = new BigDecimal("2.28");

        printTestResult(expectedPremiumResult.equals(realPremiumResult));
    }

    void shouldCalculateHighRisk() {
        ArrayList<RiskSubItem> riskSubItems = new ArrayList<>();
        RiskSubItem television = new RiskSubItem("TV", new BigDecimal("500.00"), RiskType.FIRE);
        RiskSubItem computer = new RiskSubItem("Computer", new BigDecimal("102.51"), RiskType.THEFT);
        riskSubItems.add(television);
        riskSubItems.add(computer);

        ArrayList<RiskItem> riskItems = new ArrayList<>();
        RiskItem house = new RiskItem(riskSubItems);
        riskItems.add(house);

        Policy policy = new Policy(riskItems);
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
