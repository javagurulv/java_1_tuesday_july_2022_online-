package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteriaDemo demo = new SearchCriteriaDemo();
        SearchCriteria demoCriteriaOne = demo.demoRunOneAuthorAndTitle();
        Book bookOne = new Book("Zveroboi", "Kuper");
        System.out.println(demoCriteriaOne.match(bookOne));

        SearchCriteria demoCriteriaTwo = demo.demoRunTwoAuthorAndYearOfIssue();
        Book bookTwo = new Book("Some Other Book Title", "Kuper", "1890");
        System.out.println(demoCriteriaTwo.match(bookTwo));

        SearchCriteria demoCriteriaThree = demo.demoRunThreeAuthorOrYearOfIssueOrTitle();
        Book bookThree = new Book("Zveroboi", " ", " ");
        System.out.println(demoCriteriaThree.match(bookThree));
    }

    SearchCriteria demoRunOneAuthorAndTitle() {
        // автор книги "Kuper" и название "Zveroboi"
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        return new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
    }

    SearchCriteria demoRunTwoAuthorAndYearOfIssue() {
        // автор книги "Kuper" и год выпуска 1890
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        return new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
    }

    SearchCriteria demoRunThreeAuthorOrYearOfIssueOrTitle() {
        // автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria yearOfIssueOrTitleSearchCriteria = new OrSearchCriteria(yearOfIssueSearchCriteria, titleSearchCriteria);
        return new OrSearchCriteria(authorSearchCriteria, yearOfIssueOrTitleSearchCriteria);
    }

}
