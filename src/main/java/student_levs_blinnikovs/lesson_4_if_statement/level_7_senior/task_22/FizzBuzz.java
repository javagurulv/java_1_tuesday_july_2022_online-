package student_levs_blinnikovs.lesson_4_if_statement.level_7_senior.task_22;

/*
Создайте класс FizzBuzz.
В классе FizzBuzz создайте метод со следующей сигнатурой:

class FizzBuzz {

    public String detect(int number) {
        // Реализуйте следующие требования:


        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
    }

}

Создайте класс FizzBuzzTest и напишите автоматические тесты,
которые покрывают все возможные сценарии.
 */

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Можно ли этот код улучшить? Если да то как?", student = "Да, спрятать булевы операции в методы, потому что их вызовы повторяются. Например действия из первого ифа во втором и третьем.")
class FizzBuzz {

    public boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    public boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    public String detect(int number) {
        String result;
        if (isFizzBuzz(number)) {
            result = "FizzBuzz";
        } else if (isFizz(number)) {
            result = "Fizz";
        } else if (isBuzz(number)) {
            result = "Buzz";
        } else result = String.valueOf(number);
        return result;
    }
}
