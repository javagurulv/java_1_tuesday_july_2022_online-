package student_eduard_minajev.lesson_3_oop_first_look.homework.level_3_junior;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CyborgOps {
    public static void main(String[] args){

        Scanner consoleReader = new Scanner(System.in);

        Cyborg cyborg1 = new Cyborg("NO NAME","IDLE");

        Cyborg cyborg2 = new Cyborg("NO NAME","IDLE");

        System.out.println("Please give first cyborg a name!");
        String reNameCyborg = consoleReader.nextLine();
        cyborg1.reName(reNameCyborg);
        cyborg1.nameReport();
        cyborg1.statusReport();

        System.out.println("Please give cyborg 1 an order!");
        String setNewStatus = consoleReader.nextLine();
        cyborg1.setNewStatus(setNewStatus);
        cyborg1.statusReport();

        System.out.println("Please give a name for the second cyborg!");
        String reNameCyborg2 = consoleReader.nextLine();
        cyborg2.reName(reNameCyborg2);
        cyborg2.nameReport();
        cyborg2.statusReport();

        System.out.println("Please give cyborg 2 an order!");
        String setNewStatus2 = consoleReader.nextLine();
        cyborg2.setNewStatus(setNewStatus2);
        cyborg2.statusReport();

        System.out.println("All cyborgs are named and deployed on a mission!");


    }


}
