package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

class Member extends SystemUser {

    int totalBookCheckedOut;      // eg for introducing max book amount
    Search searchObj;
    BookIssueService issueService;

    Member(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
