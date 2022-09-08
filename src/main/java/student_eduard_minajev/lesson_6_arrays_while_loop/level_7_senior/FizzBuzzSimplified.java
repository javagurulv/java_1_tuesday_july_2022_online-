package student_eduard_minajev.lesson_6_arrays_while_loop.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FizzBuzzSimplified {

    public String detect(int number) {

        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;

    }

}
