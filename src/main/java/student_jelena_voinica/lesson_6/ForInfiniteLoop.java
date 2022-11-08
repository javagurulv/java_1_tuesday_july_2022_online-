package student_jelena_voinica.lesson_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ForInfiniteLoop {
    public static void main(String[]args) {
        int i = 0;
        for (; ; ) {
            i++;
            System.out.println(i);
        }
    }
    }
