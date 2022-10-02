package student_yurii_panasiuk.lesson_10.level_5_6;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

     FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    boolean getFraud() {
        return fraud;
    }

    void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    String getRuleName() {
        return ruleName;
    }
}