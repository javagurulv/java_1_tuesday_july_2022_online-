package student_olegs_radigins.lesson_9.level_1.task_5;

class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe = new Safe2("12345", 100);
        System.out.println(safe.getMoney("12345", 50));
        System.out.println(safe.putMoney("12345", 70));
        System.out.println(safe.getMoney("12345", 400));
        System.out.println(safe.getMoney("1234", 50));

    }
}
