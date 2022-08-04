package student_levs_blinnikovs.lesson_2_variables.level_1_intern.lesson_3_oop_first_look.level_1_intern_3_junior.task_1_to_6_and_11_to_13;

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

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {

        Robot demoRobot = new Robot("DemoRobot");
        demoRobot.sayHello();
        demoRobot.sayYourName();

    }
}
