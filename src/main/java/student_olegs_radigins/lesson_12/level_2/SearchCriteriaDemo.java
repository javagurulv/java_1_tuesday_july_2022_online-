package student_olegs_radigins.lesson_12.level_2;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book book = new Book("Kuper", "Zveroboj");
        book.setYearOfIssue("1890");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboj");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria,titleSearchCriteria);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        System.out.println("SearchCriteria 1 "  + searchCriteria1.match(book));
        System.out.println("SearchCriteria 2 "  + searchCriteria2.match(book));
        System.out.println("SearchCriteria 3 "  + searchCriteria3.match(book));
        System.out.println("SearchCriteria 4 "  + searchCriteria4.match(book));


    }
}
