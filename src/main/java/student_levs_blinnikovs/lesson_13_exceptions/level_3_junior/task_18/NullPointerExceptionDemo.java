package student_levs_blinnikovs.lesson_13_exceptions.level_3_junior.task_18;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String nullString = null;
        nullString.length(); // NullPointerException happens when you try to access variable which is null
    }
}
