package student_yurii_panasiuk.lesson_12.level_2_3;

import java.util.ArrayList;
import java.util.List;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}

