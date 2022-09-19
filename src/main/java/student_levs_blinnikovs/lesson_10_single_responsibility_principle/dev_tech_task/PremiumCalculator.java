package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

class PremiumCalculator {

    private Policy policy;
    private static final double COEFFICIENT_FIRE = 0.014;
    private static final double COEFFICIENT_FIRE_HIGH_LIMIT = 0.024;
    private static final int FIRE_HIGH_LIMIT = 100;

    private static final double COEFFICIENT_THEFT = 0.11;
    private static final double COEFFICIENT_THEFT_HIGH_LIMIT = 0.05;
    private static final int THEFT_HIGH_LIMIT = 15;

    double calculate(Policy policy) {
        return calculatePremiumFire(policy) + calculatePremiumTheft(policy);
    }

    private double calculatePremiumFire(Policy policy) {
        double totalSumInsured = 0;
        double premium = 0;

        for (RiskItem riskItem : policy.getRiskItems()) {                          // todo here maybe better to pass not policy but RiskItem or even RiskSubItems to method call...
            for (RiskSubItem riskSubItem : riskItem.getRiskSubItems()) {
                if (riskSubItem.getRiskType().equals(RiskType.FIRE)) {
                    totalSumInsured += riskSubItem.getSumInsured();
                }
            }
        }

        if (totalSumInsured > FIRE_HIGH_LIMIT) {                                   // todo need something better, like turn in 1 method...
            premium = totalSumInsured * COEFFICIENT_FIRE_HIGH_LIMIT;
        }
        if (totalSumInsured <= FIRE_HIGH_LIMIT) {
            premium = totalSumInsured * COEFFICIENT_FIRE;
        }

        return premium;
    }


    private double calculatePremiumTheft(Policy policy) {
        double totalSumInsured = 0;
        double premium = 0;

        for (RiskItem riskItem : policy.getRiskItems()) {
            for (RiskSubItem riskSubItem : riskItem.getRiskSubItems()) {
                if (riskSubItem.getRiskType().equals(RiskType.THEFT)) {
                    totalSumInsured += riskSubItem.getSumInsured();
                }
            }
        }

        if (totalSumInsured > THEFT_HIGH_LIMIT) {
            premium = totalSumInsured * COEFFICIENT_THEFT_HIGH_LIMIT;
        }
        if (totalSumInsured <= THEFT_HIGH_LIMIT) {
            premium = totalSumInsured * COEFFICIENT_THEFT;
        }

        return premium;
    }

}
