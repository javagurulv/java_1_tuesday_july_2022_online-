package student_olegs_radigins.lesson_12.level_2;

import java.util.Objects;

class YearOfIssueSearchCriteria implements SearchCriteria {
    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }
    @Override
    public boolean match(Book book) {
        return Objects.equals(book.getYearOfIssue(),this.yearOfIssueToSearch) && book.getYearOfIssue() != null;
    }
}
