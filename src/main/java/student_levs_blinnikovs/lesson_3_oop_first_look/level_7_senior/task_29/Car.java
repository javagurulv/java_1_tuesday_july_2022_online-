package student_levs_blinnikovs.lesson_3_oop_first_look.level_7_senior.task_29;

/*
Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.
*/

class Car {

    final String make;
    final String model;
    int productionYear;
    String color;

    Car(String make, String model, int productionYear, String color) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
    }

    void display() {
        System.out.println("Current car on display is a " + productionYear + " " + make + " " + model + " in " + color + " color.");
    }

    void paint(String color) {
        System.out.println("Starting repaint procedure. You've chosen " + color + " color. (Original - " + this.color + ").");
        this.color = color;
        System.out.println("Car has been repainted to " + this.color + " color!");
    }

}

class CarDemo {
    public static void main(String[] args) {

        Car beamer = new Car("BMW", "330i", 2006, "black");
        beamer.display();

        beamer.paint("red");
        beamer.display();

        beamer.paint("yellow");
        beamer.display();

    }
}