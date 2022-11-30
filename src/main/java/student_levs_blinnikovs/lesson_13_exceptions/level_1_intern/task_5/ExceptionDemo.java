package student_levs_blinnikovs.lesson_13_exceptions.level_1_intern.task_5;

class ExceptionDemo extends Exception {

    Exception exception = new Exception();
    Exception exception1 = new Exception("Exception!");

    Throwable throwable = new Throwable();
    Exception exception2 = new Exception("Exception!", throwable);
    Exception exception3 = new Exception(throwable);

}
