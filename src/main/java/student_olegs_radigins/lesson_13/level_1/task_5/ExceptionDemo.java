package student_olegs_radigins.lesson_13.level_1.task_5;

class ExceptionDemo extends Exception {
    Exception exception1 = new Exception();
    Exception exception2 = new Exception("Exception");
    Throwable throwable = new Throwable();
    Exception exception3 = new Exception(throwable);
    Exception exception4 = new Exception("Exception", throwable);
}
