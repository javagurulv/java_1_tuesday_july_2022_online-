package student_olegs_radigins.lesson_12.level_2;

import java.util.Objects;

class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }
    @Override
    public boolean match(Book book) {
        return Objects.equals(book.getTitle(), this.titleToSearch) && book.getTitle() != null;
    }
}
