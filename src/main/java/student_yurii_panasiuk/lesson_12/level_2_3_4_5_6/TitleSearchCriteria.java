package student_yurii_panasiuk.lesson_12.level_2_3_4_5_6;

public class TitleSearchCriteria implements SearchCriteria {

        private String titleToSearch;

        public TitleSearchCriteria(String titleToSearch) {
            this.titleToSearch = titleToSearch;
        }

        public boolean match(Book book) {
            return book.getTitle().equals(titleToSearch);
        }

}
