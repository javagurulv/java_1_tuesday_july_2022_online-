package student_levs_blinnikovs.lesson_9_objects_equality.level_1_intern.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Safe2 {

    private String password;
    private int money;

    Safe2(String password, int money) {
        this.password = password;
        this.money = money;
    }

    public int getMoney(String password, int amount) {
        if (isPasswordCorrect(password)) {
            money -= amount;
            return money;
        }
        return -1;
    }

    public void putMoney(String password, int amount) {
        if (isPasswordCorrect(password)) {
            money += amount;
        }
    }

    private boolean isPasswordCorrect(String password) {
        return password.equals(this.password);
    }


}
