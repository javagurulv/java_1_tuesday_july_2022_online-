package student_levs_blinnikovs.lesson_9_objects_equality.level_2_intern.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

public class MainClass {
    public static void main(String[] args) {
        C c = new C();   // Выдает 3 надписи подряд потому что когда создаётся инстанция С, она вызывает свой конструктор, и 2 дэфолтных от которых она наследуется
    }
}
