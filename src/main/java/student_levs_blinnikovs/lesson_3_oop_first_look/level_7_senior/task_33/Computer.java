package student_levs_blinnikovs.lesson_3_oop_first_look.level_7_senior.task_33;

/*
Дописать код программы, что бы она запускалась
        и выводила на консоль производителя и модель компьютера.
        Менять можно только класс Computer.
*/

class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    // missing getters
    String getManufacturer() {
        return this.manufacturer;
    }

    String getModel() {
        return this.model;
    }

}


