package teacher.lesson_4_if_statement.lessoncode.alex;

public class CarDemo {

    public static void main(String[] args) {

        Car kia = new Car("KIA", "White");
        kia.printInfo();

        kia.engineOnOff();
        kia.accelerate();
        kia.accelerate();
        kia.accelerate();
        kia.accelerate();
        kia.accelerate();

        kia.printInfo();

        kia.engineOnOff();
        kia.printInfo();

        kia.engineOnOff();
        kia.decelerate();
        kia.printInfo();
    }

}
