package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle() != null && book.getTitle().equals(this.titleToSearch);
    }

}
