package student_eduard_minajev.lesson_6_arrays_while_loop.level_4_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WhileInfiniteLoop {

    public static void main (String[] args){
        WhileInfiniteLoop whileInfiniteLoop = new WhileInfiniteLoop();
        whileInfiniteLoop.infiniteLoop();

    }

    public void infiniteLoop () {
        while (true){
            System.out.println("Infinite WHile Loop");
        }
    }

}
