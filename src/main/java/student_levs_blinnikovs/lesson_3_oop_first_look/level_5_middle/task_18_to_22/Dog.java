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

class Dog {

    final String dogName; // Task 18.1, 18.2 (first and second requirement)
    int dogAge; // Task 19.1

    Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public void voice() {   // third requirement
        for (int i = 0; i < 3; i++) {
            System.out.println(dogName + " is " + dogAge + " years old.");
        }
    }

}

class DogDemo {

    public static void main(String[] args) {

        Dog mutt = new Dog("Rex", 5);
        mutt.voice();

    }

}
