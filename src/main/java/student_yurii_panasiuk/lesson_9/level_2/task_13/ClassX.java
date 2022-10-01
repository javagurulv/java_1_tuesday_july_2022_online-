package student_yurii_panasiuk.lesson_9.level_2.task_13;

class ClassX {
     ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
     ClassY(int i) {
       super(i);
         System.out.println(2);
    }
}