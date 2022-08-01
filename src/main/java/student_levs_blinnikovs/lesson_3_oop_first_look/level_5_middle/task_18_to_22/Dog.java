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

class Dog {

    final String dogName; // first and second requirement

    Dog(String dogName) {
        this.dogName = dogName;
    }

    public void voice() {   // third requirement
        for (int i = 0; i < 3; i++) {
            System.out.println(dogName);
        }
    }

}

class DogDemo {

    public static void main(String[] args) {

        Dog mutt = new Dog("Rex");
        mutt.voice();

    }

}
