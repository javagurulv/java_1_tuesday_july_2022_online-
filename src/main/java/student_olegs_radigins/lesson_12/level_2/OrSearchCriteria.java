package student_olegs_radigins.lesson_12.level_2;

class OrSearchCriteria implements SearchCriteria{
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) | rightCondition.match(book) && book != null;
    }
}
