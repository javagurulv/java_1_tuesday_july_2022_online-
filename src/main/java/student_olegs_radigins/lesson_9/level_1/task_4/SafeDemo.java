package student_olegs_radigins.lesson_9.level_1.task_4;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        System.out.println(safe.money + " " + safe.password);
        safe.money = 100;
        safe.password = "12345";
        System.out.println(safe.money + " " + safe.password);
    }
}
