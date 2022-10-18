package student_ernest_aleskevics.lesson_9.level_1.task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeDemo {

    public static void main(String[] args) {
        Safe safeOne = new Safe();
        safeOne.password = "Lucky";
        safeOne.amountOfMoney = 777;
        System.out.println("Password: " + safeOne.password + " Amount of money: " + safeOne.amountOfMoney);
    }
}
