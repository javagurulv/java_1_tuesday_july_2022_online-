package student_yurii_panasiuk.lesson_14.level_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculatorImpl implements TaxCalculator{
   private static BigDecimal taxBracketOne = new BigDecimal("20000");
   private static BigDecimal taxRateOne = new BigDecimal("0.25");
   private static BigDecimal taxRateTwo = new BigDecimal("0.4");
   private int roundingParameter = 2;
   private RoundingMode roundingMode = RoundingMode.HALF_UP;

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal tax = new BigDecimal(0);

        if (income.compareTo(taxBracketOne) <= 0) {
            tax = income.multiply(getTaxRate(income));
        }
        if (income.compareTo(taxBracketOne) > 0) {
            BigDecimal taxAfterBracketOne = income.subtract(taxBracketOne).multiply(getTaxRate(income));
            BigDecimal taxBeforeBracketOne = taxBracketOne.multiply(getTaxRate(taxBracketOne));
            tax = taxAfterBracketOne.add(taxBeforeBracketOne);
        }
        return tax.setScale(roundingParameter, roundingMode);
    }

    private static BigDecimal getTaxRate(BigDecimal income) {
        BigDecimal taxrate = new BigDecimal(0);

        if (income.compareTo(BigDecimal.ZERO) <= 0) {
            taxrate = BigDecimal.ZERO;
        }
        if (income.compareTo(taxBracketOne) <= 0) {
            taxrate = taxRateOne;
        }
        if (income.compareTo(taxBracketOne) > 0) {
            taxrate = taxRateTwo;
        }

        return taxrate;
    }
}
