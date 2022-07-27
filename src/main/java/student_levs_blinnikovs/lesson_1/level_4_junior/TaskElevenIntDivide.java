package student_levs_blinnikovs.lesson_1.level_4_junior;

/*

Write a Java program to divide two numbers and print on the screen.
Test Data :
50/3
Expected Output :
16

 */

public class TaskElevenIntDivide {

    // Input
    static int var1 = 50;
    static int var2 = 3;

    // Function returns division result of 2 integer values
    public static int intDivide(int int1, int int2) {
        return int1 / int2;
    }

    public static void main(String[] args) {
        System.out.println("Result of division: " + intDivide(var1, var2));
    }
}
