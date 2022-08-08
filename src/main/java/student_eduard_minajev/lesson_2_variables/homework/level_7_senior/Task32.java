package student_eduard_minajev.lesson_2_variables.homework.level_7_senior;
import java.util.Scanner;
public class Task32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's search for Lenin's square! "); //How to find Lenin's square?
        System.out.print("Please enter Lenin's tall");/* You have to multiply Lenin's tall
        by Lenin's width*/
        int leninsTall = scanner.nextInt();
        System.out.println("Please enter Lenin's width");
        int leninsWidth = scanner.nextInt();
        int leninsSquare = leninsTall * leninsWidth;
        System.out.println("Congratulations! Your Lenin's square is " + leninsSquare);


            }
}
