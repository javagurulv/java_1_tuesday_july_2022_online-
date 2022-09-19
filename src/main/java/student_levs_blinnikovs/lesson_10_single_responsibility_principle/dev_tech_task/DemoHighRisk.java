package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

class DemoHighRisk {

    public static void main(String[] args) {

        RiskSubItem television = new RiskSubItem("TV", 500, RiskType.FIRE);
        RiskSubItem computer = new RiskSubItem("Computer", 102.51, RiskType.THEFT);

        RiskSubItem[] riskSubItems = {television, computer};
        RiskItem house = new RiskItem(riskSubItems);

        RiskItem[] riskItems = {house};
        Policy policy = new Policy(riskItems);

        PremiumCalculator calculator = new PremiumCalculator();

        double premiumResult = calculator.calculate(policy);
        System.out.println(String.format("%.2f", premiumResult) + " EUR");

    }

}
