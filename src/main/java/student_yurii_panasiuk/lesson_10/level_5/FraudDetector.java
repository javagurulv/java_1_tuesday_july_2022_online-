package student_yurii_panasiuk.lesson_10.level_5;

import java.util.List;

class FraudDetector {

     List<FraudRule> listOfRules;

    FraudDetector(List<FraudRule> listOfRules) {
        this.listOfRules = listOfRules;
    }

    boolean isFraud (Transaction transaction){
        int resultCounter = 0;
        for (int i = 0; i < listOfRules.size(); i++){
            if (listOfRules.get(i).isFraud(transaction)) {
                resultCounter = 1;
               // break;
            }
        }
        return resultCounter == 1;
    }
}
