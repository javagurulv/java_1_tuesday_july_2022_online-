package student_levs_blinnikovs.lesson_9_objects_equality.level_1_intern.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Safe2Demo {
    public static void main(String[] args) {

        Safe2 safe2 = new Safe2("qwerty", 100);

        //safe2.password;
        //safe2.money; - won't work

        int balanceAfterWithdraw = safe2.getMoney("qwerty", 50);
        System.out.println(balanceAfterWithdraw);

        safe2.putMoney("qwerty", 75);
        balanceAfterWithdraw = safe2.getMoney("qwerty", 0);
        System.out.println(balanceAfterWithdraw);


    }
}
