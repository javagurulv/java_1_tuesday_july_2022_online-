package student_eduard_minajev.lesson_6_arrays_while_loop.level_4_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WhileLoopBreak {

    public static void main (String[] args){
       WhileLoopBreak whileLoopBreak = new WhileLoopBreak();
       whileLoopBreak.breakWhileLoop();


    }

    public void breakWhileLoop(){
        int a = 1;
        while (a < 10){
            System.out.println(a);
            a++;
            if (a == 10){
                break;
            }
        }
    }



}
