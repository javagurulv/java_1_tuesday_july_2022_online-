package student_levs_blinnikovs.lesson_3_oop_first_look.level_1_intern_3_junior.task_3_4;

// Task 3
/*
task2 (?? This is from task 3) Создайте отдельный класс RobotDemo для демонстрации
работы с классом Robot.

Внутри класса RobotDemo создайте метод

    public static void main(String[] args) {
        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
    }
 */

// Task 4
/*
В методе main(...) класса RobotDemo вызовите
метод sayHello() у созданного ранее виртуального обьекта.
Запустите вашу программу и убедитесь, что созданный вами
виртуальный обьект робот напечатал на консоли слово "Hello!".
 */

import student_levs_blinnikovs.lesson_3_oop_first_look.level_1_intern_3_junior.task_1_2_5_6_11_12_13.Robot;

public class RobotDemo extends Robot {  // did extend to use Robot class methods for RobotDemo

    public RobotDemo(String robotName) {
        super(robotName);
    }

    public static void main(String[] args) {

        RobotDemo demoRobot = new RobotDemo("DemoRobot");
        demoRobot.sayHello();
        demoRobot.sayYourName();

    }
}
