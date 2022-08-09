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

class FizzBuzz {

    public String detect(int number) {
        String result;
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else result = String.valueOf(number);
        return result;
    }
}
