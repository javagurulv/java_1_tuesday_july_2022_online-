package student_eduard_minajev.lesson_4_if_statement.level_7_senior.task_27;

public class FizzBuzz {

    public String detect (int number){
        if ((number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";
        } else if (number % 5 == 0 ) {
            return "Buzz";
        }else if (number % 3 == 0){
            return "Fizz";
        }else {
            return "" + number;
        }
    }
}


