package student_levs_blinnikovs.lesson_11_interfaces.level_3_junior.task_6;

/**
 * Функциональный интерфейс это интерфейс у которого есть только один абстрактный метод, но при
 * этом могут быть статические, приватные и дефолтные.
 * Хорошая практика их обозначать аннотацией @FunctionalInterface
 */

@FunctionalInterface
interface MyFunctionalInterface {

    void doStuff();

    static void doSomething() {

    }

    private void doYetAnotherSomething() {

    }

    default void someMethod() {

    }

}
