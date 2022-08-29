package student_sobit_eshniyozov.lesson_4_if_statement.level_7.Task_22;

class FizzBuzz {

    int number;

    public String detect(int number) {
        this.number = number;
        if ((this.number % 3 == 0) && (this.number % 5 == 0)) {
            return "FizzBuzz";
        } if (this.number % 5 == 0) {
            return "Buzz";
        } if (this.number % 3 == 0) {
            return "Fizz";
        } else {
            return ""+number;
        }
    }
}// - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
