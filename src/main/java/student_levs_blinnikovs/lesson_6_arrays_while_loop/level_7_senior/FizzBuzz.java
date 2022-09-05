package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_7_senior;

/*
Разберитесь, что делает класс указанный ниже.
        Создайте класс FizzBuzzTest и напишите автоматические тесты
        на все сценарии. Упростите FizzBuzz класс!
        Убедитесь, что после упрощения все автоматические тесты проходят.

        Подсказка: а нужно ли свойство класса initialNumber?
        Или метод detect можно реализовать без него?
 */

class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + number;
    }

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.println(fizzBuzz.detect(15));
        System.out.println(fizzBuzz.detect(3));
        System.out.println(fizzBuzz.detect(5));

    }

}