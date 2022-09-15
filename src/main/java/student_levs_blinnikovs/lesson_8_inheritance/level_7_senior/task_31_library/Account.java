package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

class Account {

    private static int lastAccountId = 0;
    private final int accountId;
    String userName;
    String password;

    Account(String userName, String password) {
        lastAccountId++;
        this.accountId = lastAccountId;

        this.userName = userName;
        this.password = password;
    }

}
