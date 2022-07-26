package teacher.lesson_4_if_statement.lessoncode.alex.basictestapproach;

public class Calculator {

    public int max(int numberA, int numberB) {
        if (numberA > numberB) {
            return numberA;
        } else {
            return numberB;
        }
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
