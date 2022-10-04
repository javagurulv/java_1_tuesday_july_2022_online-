package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    // реализуйте конструктор класса

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    // реализуйте get() и set() методы для каждого свойства
    public boolean getFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FraudDetectionResult that = (FraudDetectionResult) o;
        return fraud == that.fraud && Objects.equals(ruleName, that.ruleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fraud, ruleName);
    }
}
