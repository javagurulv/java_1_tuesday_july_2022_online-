package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior.task_6_x;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor() != null && book.getAuthor().equals(this.authorToSearch);
    }

}
