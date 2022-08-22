package student_yurii_panasiuk.lesson_4.level_7_senior.task_22;

 class FizzBuzzTest {

     public static void main(String[] args) {

         FizzBuzz test = new FizzBuzz ();

        // System.out.println(test.detect(15)); ручной тест


         int a = 3; int b = 5; int c = 15; // задаем 3 переменные для теста
             if (test.detect(a).equals("Fizz") &&
                 test.detect(b).equals("Buzz") &&
                 test.detect(c).equals("FizzBuzz") ) {

                     System.out.println("Test = OK");}
                 else { System.out.println("Test = FAIL");}
     }
 }
