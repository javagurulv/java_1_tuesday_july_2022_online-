package student_olegs_radigins.lesson_9.level_1.task_5;

class Safe2 {
    private String password;
    private int money;

    public Safe2(String password, int money) {
        this.password = password;
        this.money = money;
    }

    public int getMoney(String enteredPassword, int getMoney) {
        if (enteredPassword.equals(password)) {
            if (money >= getMoney) {
                money -= getMoney;
            }
        }
        return money;

    }
    public int putMoney(String enteredPassword, int putMoney){
        if(enteredPassword.equals(password)) {
            money += putMoney;
        }
        return money;
    }

}
