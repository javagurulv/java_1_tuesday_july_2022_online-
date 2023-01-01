package student_olegs_radigins.lesson_12.level_2;

import java.util.Objects;

public class AuthorSearchCriteria implements SearchCriteria {
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {

        return Objects.equals(book.getAuthor(), this.authorToSearch) && book.getAuthor() != null;
    }
}
