package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.math.BigDecimal;

class PremiumCalculator {

    private Policy policy;
    private static final BigDecimal COEFFICIENT_FIRE = new BigDecimal("0.014");
    private static final BigDecimal COEFFICIENT_FIRE_HIGH_LIMIT = new BigDecimal("0.024");
    private static final BigDecimal FIRE_HIGH_LIMIT = new BigDecimal("100.00");

    private static final BigDecimal COEFFICIENT_THEFT = new BigDecimal("0.11");
    private static final BigDecimal COEFFICIENT_THEFT_HIGH_LIMIT = new BigDecimal("0.05");
    private static final BigDecimal THEFT_HIGH_LIMIT = new BigDecimal("15.00");

    BigDecimal calculate(Policy policy) {
        return calculatePremiumFire(policy).add(calculatePremiumTheft(policy));
    }

    private BigDecimal calculatePremiumFire(Policy policy) {
        BigDecimal totalSumInsured = new BigDecimal("0.00");
        BigDecimal premium = new BigDecimal("0.00");

        for (RiskItem riskItem : policy.getRiskItems()) {                          // todo here maybe better to pass not policy but RiskItem or even RiskSubItems to method call...
            for (RiskSubItem riskSubItem : riskItem.getRiskSubItems()) {            // todo hide in getTotalSumInsured()... ?
                if (riskSubItem.getRiskType().equals(RiskType.FIRE)) {
                    totalSumInsured = totalSumInsured.add(riskSubItem.getSumInsured());
                }
            }
        }

        if (totalSumInsured.compareTo(FIRE_HIGH_LIMIT) > 0) {                                   // todo need something better, like turn in 1 method...
            premium = totalSumInsured.multiply(COEFFICIENT_FIRE_HIGH_LIMIT);
        }
        if (totalSumInsured.compareTo(FIRE_HIGH_LIMIT) <= 0) {
            premium = totalSumInsured.multiply(COEFFICIENT_FIRE);
        }

        return premium;
    }


    private BigDecimal calculatePremiumTheft(Policy policy) {
        BigDecimal totalSumInsured = new BigDecimal("0.00");
        BigDecimal premium = new BigDecimal("0.00");

        for (RiskItem riskItem : policy.getRiskItems()) {
            for (RiskSubItem riskSubItem : riskItem.getRiskSubItems()) {
                if (riskSubItem.getRiskType().equals(RiskType.THEFT)) {
                    totalSumInsured = totalSumInsured.add(riskSubItem.getSumInsured());
                }
            }
        }

        if (totalSumInsured.compareTo(THEFT_HIGH_LIMIT) > 0) {
            premium = totalSumInsured.multiply(COEFFICIENT_THEFT_HIGH_LIMIT);
        }
        if (totalSumInsured.compareTo(THEFT_HIGH_LIMIT) <= 0) {
            premium = totalSumInsured.multiply(COEFFICIENT_THEFT);
        }

        return premium;
    }

}
