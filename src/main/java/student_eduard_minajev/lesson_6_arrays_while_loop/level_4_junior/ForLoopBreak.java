package student_eduard_minajev.lesson_6_arrays_while_loop.level_4_junior;

import java.util.Scanner;

public class ForLoopBreak {

    public static void main(String[] args){
        ForLoopBreak forLoopBreak = new ForLoopBreak();
        forLoopBreak.breakForLoop();


    }

    public void breakForLoop (){
        int breakValue;
        Scanner scanner = new Scanner(System.in);
        for (;;){
            System.out.println("Press 0 to end the loop");
            breakValue = scanner.nextInt();
            if (breakValue == 0){
                break;
            }
        }
    }

}
