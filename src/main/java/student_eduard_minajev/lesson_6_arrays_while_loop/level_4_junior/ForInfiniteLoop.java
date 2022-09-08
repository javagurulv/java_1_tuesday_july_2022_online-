package student_eduard_minajev.lesson_6_arrays_while_loop.level_4_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ForInfiniteLoop {

    public static void main(String[] args){
        ForInfiniteLoop forInfiniteLoop = new ForInfiniteLoop();
        forInfiniteLoop.infininteLoop();

    }

    public void infininteLoop(){
        for (;;){
            System.out.println("InfiniteLoop-For");
        }
    }

}
