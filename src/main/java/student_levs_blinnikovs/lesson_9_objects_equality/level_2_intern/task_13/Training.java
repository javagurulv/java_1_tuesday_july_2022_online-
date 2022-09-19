package student_levs_blinnikovs.lesson_9_objects_equality.level_2_intern.task_13;

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY(int i) {
        super(i);                                // тут нужен был дэфолтный конструктор
        System.out.println(2);
    }
}
