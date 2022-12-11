package student_yurii_panasiuk.lesson_13.level_2;

class BankClient {

    private String uid;      // уникальный идентификатор клиента
    private String fullName; // полное имя клиента

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
// создайте конструктор класса, в котором вы получите значения указанных свойств

    // создайте get() методы для каждого из свойств

}