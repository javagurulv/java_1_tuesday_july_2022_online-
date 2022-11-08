package student_olegs_radigins.lesson_8.level_6.task_30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Varargs {
    public static void main(String... sss) {
        print("Hi",",","my","name","is","Olegs");
    }

    static void print(String... words){
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
