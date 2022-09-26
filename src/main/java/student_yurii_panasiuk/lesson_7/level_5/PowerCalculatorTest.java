package student_yurii_panasiuk.lesson_7.level_5;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_7_encapsulation/codereview/CleanCodeWarning_4.txt")
 class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();

        if (!calculator.verificationPower(0)){
            calculator.verificationFailedMessage();
        }

        powerCalculatorTest();

    }

        static void powerCalculatorTest () {
            PowerCalculator calculator = new PowerCalculator();

            List<Double> listOfNubers = List.of      (1.0, 2.0, 3.0);
            List<Double> listOfPowers = List.of      (1.0, 2.0, 3.0);
            List<Double> listOfAnswers = List.of     (1.0, 4.0, 27.0);

            System.out.print("powerCalculatorTest - ");
            int correctAnswerCounter = 0;

            for (int i = 0; i < listOfNubers.size(); i++ )

            if ((calculator.exponentiation(listOfNubers.get(i), listOfPowers.get(i))) ==
                (listOfAnswers.get(i))){
                correctAnswerCounter++;
                }
            if (correctAnswerCounter == listOfNubers.size() ){
                System.out.println(" OK");
            }
             else {System.out.println(" FAIL");}
        }
    }

