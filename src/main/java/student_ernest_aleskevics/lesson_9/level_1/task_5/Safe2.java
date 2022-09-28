package student_ernest_aleskevics.lesson_9.level_1.task_5;

class Safe2 {

    private String password;
    private int amountInBank;

    public Safe2 (String password, int amountInBank){
        this.password = password;
        this.amountInBank = amountInBank;
    }

    public int getMoney(String password, int amount){
        if (password.equals(this.password)){
            return amountInBank -= amount;
        } else {
            System.out.println("WRONG password!");
        }
        return amountInBank;
    }


    public int putMoney(String password, int amount) {
        if (password.equals(this.password)) {
            return amountInBank += amount;
        } else {
            System.out.println("WRONG password!");
        }
        return amountInBank;
    }

    @Override
    public String toString() {
        return "Your password correct: " + password + " Amount of money in bank: " + amountInBank;
    }


}
