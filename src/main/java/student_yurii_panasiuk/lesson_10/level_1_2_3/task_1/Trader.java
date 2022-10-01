package student_yurii_panasiuk.lesson_10.level_1_2_3.task_1;

   /*      Каждая транзакция в системе должна быть проверена на мошенничество (fraud).
        Для автоматического обнаружения мошенничества при проверке транзакций
        в систему нужно добавить правила, которые будут приведены ниже.

    */

class Trader {

    private String fullName;
    private String city;

     Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

     String getFullName() {
        return fullName;
    }

     String getCity() {
        return city;
    }
}


