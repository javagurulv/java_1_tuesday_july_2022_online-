package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

import java.util.Date;

class BookIssueDetail extends BookLending {

    Date dueDate;

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
