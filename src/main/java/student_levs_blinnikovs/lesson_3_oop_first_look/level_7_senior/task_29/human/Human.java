package student_levs_blinnikovs.lesson_3_oop_first_look.level_7_senior.task_29.human;

/*
Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.
*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Human {

    String firstName;
    String lastName;
    int age;
    boolean isEmployed;
    String jobName;

    Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void greet() {
        if (!isEmployed) {
            System.out.println("Hello, my name is " + firstName + " " + lastName + ", I'm " + age + " years old and currently looking for the job.");
        } else System.out.println("Hello, my name is " + firstName + " " + lastName + " and I'm currently working at " + jobName + ".");
    }

    void greetWithFakeName(String fakeName) {
        System.out.println("My name is " + fakeName + ". Just kidding. My real name is " + this.firstName + "!");
    }

    void employ(String jobName) {
        this.isEmployed = true;
        this.jobName = jobName;
        System.out.println(firstName + " has been employed to " + jobName);
    }

    void layoff() {
        this.isEmployed = false;
        this.jobName = "";
        System.out.println(this.firstName + " has lost the job.");
    }

    void changeIdentity(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}


