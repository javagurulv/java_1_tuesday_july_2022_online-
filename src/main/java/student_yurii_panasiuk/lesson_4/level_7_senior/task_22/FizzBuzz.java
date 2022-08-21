package student_yurii_panasiuk.lesson_4.level_7_senior.task_22;

class FizzBuzz {


     String detect (int number) {
         if (number % 3 == 0 && number % 5 != 0) {
             return "Fizz";
         } else if (number % 5 == 0 && number % 3 != 0) {
             return "Buzz";
         } else if (number % 5 == 0 ) {
             return "FizzBuzz";
         } else return "" + number;
     }



}
