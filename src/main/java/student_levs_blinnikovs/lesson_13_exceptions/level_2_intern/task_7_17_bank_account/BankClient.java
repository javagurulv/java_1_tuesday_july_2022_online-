package student_levs_blinnikovs.lesson_13_exceptions.level_2_intern.task_7_17_bank_account;

class BankClient {

    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}
