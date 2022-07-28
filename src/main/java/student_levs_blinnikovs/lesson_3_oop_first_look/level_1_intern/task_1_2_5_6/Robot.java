package student_levs_blinnikovs.lesson_3_oop_first_look.level_1_intern.task_1_2_5_6;

// Task 1
/*
Создайте класс робот (Robot).

Научите вашего робота "говорить" привет.

Создайте в классе Robot метод со следующей сигнатурой:

    public void sayHello() {
        // тут напишите команду распечатки на консоли строки "Hello!"
    }
 */

// Task 5
/*
Научите вашего робота "говорить" как его зовут.

Создайте в классе Robot метод со следующей сигнатурой:

    public void sayYourName() {
        // тут напишите команду распечатки на консоли строки "My name is ROBO"
    }

В методе main(...) класса RobotDemo вызовите
метод sayYourName() у созданного ранее виртуального обьекта.
Запустите вашу программу и убедитесь, что созданный вами
виртуальный обьект робот напечатал на консоли "My name is ROBO".
 */

// Task 6
/*
Создаём свою армию роботов!

В этом задании мы продолжаем работать с классом Robot.

В методе main(...) класса RobotDemo продемонстрируйте создание
нескольких виртуальный обьектов робот и работу с ними
(вызовы у них методов sayHello() и sayYourName()).

PS: ваш код внутри main метода будет выглядеть примерно так:

Robot robot1 = new Robot();
robot1.sayHello();
robot1.sayYourName();

Robot robot2 = new Robot();
robot2.sayHello();
robot2.sayYourName();

Класс (Robot) это как чертёж или шаблон, на основе которого
в вашей программе можно создавать сколько угодно виртуальных
обьектов и управлять ими (вызывать у них разные методы).
 */

public class Robot {

    public Robot(){

    }
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is ROBO");
    }

    public static void main(String[] args) {

        Robot roboCop = new Robot();
        roboCop.sayHello();
        roboCop.sayYourName();

        Robot r2d2 = new Robot();
        r2d2.sayHello();
        r2d2.sayYourName();

    }

}
