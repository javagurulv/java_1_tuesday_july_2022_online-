package student_levs_blinnikovs.lesson_8_inheritance.level_3_junior.task_11;

/*
Исправьте код программы так, что бы он компилировался.
        Предоставлять реализацию метода canReceiveLoan() нельзя.
        Подсказка: если у класса есть хотя бы один абстрактный метод
        (тоесть метод без реализации), то класс должен быть абстрактным.
 */

abstract class LoanSystem {

    abstract boolean canReceiveLoan(Human human);

}
