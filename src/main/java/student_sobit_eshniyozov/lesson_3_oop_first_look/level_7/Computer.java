package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    String getManufacturer(){return this.manufacturer;}
    String getModel(){return this.model;}
}
