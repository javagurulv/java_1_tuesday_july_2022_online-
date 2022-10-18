package student_ernest_aleskevics.lesson_9.level_1.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Safe2Demo {

    public static void main(String[] args) {

        Safe2 safe3 = new Safe2("ASD123", 1000);
        safe3.getMoney("ASD123", 200);
        System.out.println(safe3);
        safe3.putMoney("ASD123", 300);
        System.out.println(safe3);
        safe3.getMoney("1233", 300);

    }
}
