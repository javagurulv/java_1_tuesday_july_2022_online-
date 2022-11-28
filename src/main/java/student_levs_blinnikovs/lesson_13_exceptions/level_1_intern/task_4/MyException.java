package student_levs_blinnikovs.lesson_13_exceptions.level_1_intern.task_4;

class MyException extends Exception {

    public MyException(String message) {
        super(message); // now will go to public Exception(String message) {super(message)}
    }

}
