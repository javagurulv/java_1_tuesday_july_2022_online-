package student_olegs_radigins.lesson_14.level_1;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator{
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if(income.compareTo(new BigDecimal(20000)) <= 0){
            return income.multiply(new BigDecimal(0.25));
        }
        return null;
    }
}
