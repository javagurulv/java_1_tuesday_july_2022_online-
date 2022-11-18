package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_middle.task_6_x;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue() != null && book.getYearOfIssue().equals(this.yearOfIssueToSearch);
    }

}
