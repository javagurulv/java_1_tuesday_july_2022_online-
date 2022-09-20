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
        BigDecimal sumInsuredFire = calculateSumInsured(policy, RiskType.FIRE);                   // todo here better to in separate method, and iterate over RiskTypes
        BigDecimal sumInsuredTheft = calculateSumInsured(policy, RiskType.THEFT);
        return calculatePremiumFire(sumInsuredFire).add(calculatePremiumTheft(sumInsuredTheft));
    }

    private BigDecimal calculateSumInsured(Policy policy, RiskType riskType) {
        BigDecimal sumInsured = new BigDecimal("0.00");
        for (RiskItem riskItem : policy.getRiskItems()) {                       // todo here maybe better to pass not policy but RiskItem or even RiskSubItems to method call...
            for (RiskSubItem riskSubItem : riskItem.getRiskSubItems()) {        // todo hide in getTotalSumInsured()... ?
                if (riskSubItem.isInsuredFor(riskType)) {                           // todo extract logic into separate method and make (1) return risk sub items and (2) calculate
                    sumInsured = sumInsured.add(riskSubItem.getSumInsured());
                }
            }
        }
        return sumInsured;
    }

    private BigDecimal calculatePremiumTheft(BigDecimal sumInsured) {
        BigDecimal premium = new BigDecimal("0.00");

        if (sumInsured.compareTo(THEFT_HIGH_LIMIT) > 0) {
            premium = sumInsured.multiply(COEFFICIENT_THEFT_HIGH_LIMIT);                // todo extract logic of finding coefs and multiplication methods as well
        }
        if (sumInsured.compareTo(THEFT_HIGH_LIMIT) <= 0) {
            premium = sumInsured.multiply(COEFFICIENT_THEFT);
        }

        return premium;
    }

    private BigDecimal calculatePremiumFire(BigDecimal sumInsured) {
        BigDecimal premium = new BigDecimal("0.00");

        if (sumInsured.compareTo(FIRE_HIGH_LIMIT) > 0) {                                   // todo need something better, like turn in 1 method...
            premium = sumInsured.multiply(COEFFICIENT_FIRE_HIGH_LIMIT);             // todo extract logic of finding coefs and multiplication methods as well
        }
        if (sumInsured.compareTo(FIRE_HIGH_LIMIT) <= 0) {
            premium = sumInsured.multiply(COEFFICIENT_FIRE);
        }

        return premium;
    }


}
