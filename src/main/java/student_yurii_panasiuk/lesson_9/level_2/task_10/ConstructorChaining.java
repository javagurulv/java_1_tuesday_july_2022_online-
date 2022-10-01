package student_yurii_panasiuk.lesson_9.level_2.task_10;

/*
 Создайте в этом классе публичный конструктор с двумя параметрами.
        Внутри этого конструктора первой строкой вызовите приватный
        конструктор с одним параметром.
 */

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this("test");
        this.parameterCount = parameterCount;
    }
}

