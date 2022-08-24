package student_eduard_minajev.lesson_4_if_statement.level_7_senior.task_22;

public class FizzBuzz {

    //Признаюсь, я какое-то время недоумевал почему не все работает...

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


