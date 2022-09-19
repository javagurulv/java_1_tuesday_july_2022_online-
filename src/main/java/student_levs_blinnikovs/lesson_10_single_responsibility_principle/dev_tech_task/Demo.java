package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.text.MessageFormat;

class Demo {

    public static void main(String[] args) {

        RiskSubItem television = new RiskSubItem("TV", 100, RiskType.FIRE);
        RiskSubItem computer = new RiskSubItem("Computer", 8, RiskType.THEFT);

        RiskSubItem[] riskSubItems = {television, computer};
        RiskItem house = new RiskItem(riskSubItems);

        RiskItem[] riskItems = {house};
        Policy policy = new Policy(riskItems);

        PremiumCalculator calculator = new PremiumCalculator();

        double premiumResult = calculator.calculate(policy);
        System.out.println(String.format("%.2f", premiumResult) + " EUR");

    }

}
