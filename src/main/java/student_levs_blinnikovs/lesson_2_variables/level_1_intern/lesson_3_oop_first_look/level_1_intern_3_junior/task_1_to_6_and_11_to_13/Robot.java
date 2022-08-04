package student_levs_blinnikovs.lesson_2_variables.level_1_intern.lesson_3_oop_first_look.level_1_intern_3_junior.task_1_to_6_and_11_to_13;

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

// Task 11
/*
Дайте роботу имя!

Тема: объявление свойства класса.

Мы можем создать сколько угодно виртуальных обьектов робот.
Но все они при вызове метода sayYourName() печатают на
консоль одно и то же: "My name is ROBO". Давайте это исправим!
Давайте научим наших роботов запоминать своё уникальное имя
при создании и потом использовать его при вызове команды
sayYourName().

Добавьте в класс Robot свойство name:

    class Robot {

        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        String name;

        ....
    }


 */

// Task 12

/*
Тема: объявление конструктора класса.


Добавьте в класс Robot конструктор с параметром String name:

    class Robot {

        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        String name;

        // Это конструктор класса. У этого конструктора один параметр
        // с названием name и типом String. Тоесть при создании робота
        // в его конструктор будут передавать название робота.
        Robot(String robotName) {
            this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

    }

В классе RobotDemo передайте в конструктор каждого робота его название:

Robot robot1 = new Robot("Rider"); // пусть этого робота зовут "Rider"
robot1.sayHello();
robot1.sayYourName();

Robot robot2 = new Robot("John"); // а этого робота зовут "John"
robot2.sayHello();
robot2.sayYourName();
 */

// Task 13
/*
Дайте роботу имя! Продолжение.

Тема: использование свойства класса.


Воспользуйтесь свойством класса в методе sayYourName():

    class Robot {

        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        String name;

        // Это конструктор класса. У этого конструктора один параметр
        // с названием name и типом String. Тоесть при создании робота
        // в его конструктор будут передавать название робота.
        Robot(String robotName) {
            this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

        void sayYourName() {
            System.out.println("My name is " + this.name);
        }

    }

Запустите программу RobotDemo и убедитесь,
что каждый робот теперь запомнил своё имя!
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot {

    String robotName;

    public Robot(String robotName){
        this.robotName = robotName;
    }
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.robotName);
    }

    public static void main(String[] args) {

        Robot roboCop = new Robot("RoboCop");
        roboCop.sayHello();
        roboCop.sayYourName();

        Robot r2d2 = new Robot("R2D2");
        r2d2.sayHello();
        r2d2.sayYourName();

    }

}


