package student_yurii_panasiuk.lesson_10.level_5_6;

import java.util.List;

class FraudDetector {

     List<FraudRule> listOfRules;

    FraudDetector(List<FraudRule> listOfRules) {
        this.listOfRules = listOfRules;
    }

    FraudDetectionResult isFraud (Transaction transaction){
        FraudDetectionResult result = new FraudDetectionResult(false, "null");
        for (int i = 0; i < listOfRules.size(); i++){
            if (listOfRules.get(i).isFraud(transaction)) {
               result.setRuleName(listOfRules.get(i).getRuleName());
               result.setFraud(true);
            }
        }
        return result;
    }
}
