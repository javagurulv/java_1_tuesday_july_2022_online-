package student_eduard_minajev.lesson_3_oop_first_look.homework.level_2_intern.task_9;
import java.util.Scanner;
public class YourName {
    public static void main(String[] args){
        Scanner visitorName = new Scanner(System.in);
        System.out.println("Hello guest! What is your name?");
        String guestName = visitorName.nextLine();
        Guest visitor1 = new Guest(guestName);
        visitor1.greetGuest();


    }

}
