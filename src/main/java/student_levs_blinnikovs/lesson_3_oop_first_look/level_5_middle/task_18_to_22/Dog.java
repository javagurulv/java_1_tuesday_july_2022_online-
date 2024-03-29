package student_levs_blinnikovs.lesson_3_oop_first_look.level_5_middle.task_18_to_22;

// Task 18
/*
Тема: создание класса Dog.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- У собаки должна быть кличка.
- Кличку собаке дают в момент создания и потом ее изменить нельзя.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки три раза.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
 */

// Task 19
/*
Бизнес требования:
- Должна быть возможность указывать возраст собаки.
- Возраст указывается в годах (целам числом).
- Возраст собаке дают в момент создания.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки и ее возраст. ??? Тоже три раза?
 */

// Task 20
/*
Бизнес требования:
- Должна быть возможность увеличивать возраст собаки на один.

PS: научите собаку праздновать свой день рождения,
создайте в классе Dog метод:

    void happyBirthday() {
        // напишите тут команду увеличения возраста на 1
    }

Создайте собаку,
заставьте её подать голос,
заставте её отпраздновать день рождение,
заставьте её подать голос снова и убедитесь в том,
что её возраст увеличился на 1.
 */

// Task 21
/*
Бизнес требования:
- Сделайте возможность указывать цвет собаки.
- Пусть цвет задаётся просто строкой: "Red", "Black", etc.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки, ее возраст и цвет.

PS: добавте свойство color в класс Dog,
добавте в конструктор класса новое свойство и сохраните его,
дополните метод voice() выводом цвета на консоль.
 */

// Task 22
/*
Бизнес требования:
- Должна быть возможность менять цвет собаки на другой.

PS: создайте в классе Dog метод:

    void changeColor(String newColor) {
        // напишите тут команду сохранения нового цвета в свойство класса
    }

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).

Создайте собаку,
заставьте её подать голос,
заставте её поменять цвет,
заставьте её подать голос снова и убедитесь в том,
что собака изменила свой цвет.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {

    final String dogName; // Task 18.1, 18.2 (first and second requirement)
    private int dogAge; // Task 19.1
    private String dogColor; // Task 20

    Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public void voice() {
        for (int i = 0; i < 3; i++) {
            System.out.println(dogName + " is " + dogAge + " years old and it is " + dogColor + " color.");
        }
    }

    void happyBirthday() {  // Task 20;
        this.dogAge++;
    }

    void changeColor(String newColor) { // Task 22
        this.dogColor = newColor;
        System.out.println("The dog has been dyed to " + dogColor + " color!");
    }

}

