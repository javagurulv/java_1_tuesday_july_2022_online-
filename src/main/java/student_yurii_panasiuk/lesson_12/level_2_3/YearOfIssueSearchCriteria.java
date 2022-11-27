package student_yurii_panasiuk.lesson_12.level_2_3;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().equals(book.getYearOfIssue()) && !book.getYearOfIssue().equals(null);
    }
}
