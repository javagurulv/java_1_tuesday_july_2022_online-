package student_yurii_panasiuk.lesson_8.level_3.task_11;

/*
Исправьте код программы так, что бы он компилировался.
Предоставлять реализацию метода canReceiveLoan() нельзя.
Подсказка: если у класса есть хотя бы один абстрактный метод
(тоесть метод без реализации), то класс должен быть абстрактным.
 */



abstract class LoanSystem {

    abstract <Human> boolean canReceiveLoan(Human human);  // дженерик Human странно что он не описан и компилируется


}