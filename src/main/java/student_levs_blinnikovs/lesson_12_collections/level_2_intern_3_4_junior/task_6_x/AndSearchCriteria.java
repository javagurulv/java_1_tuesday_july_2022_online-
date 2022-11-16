package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior.task_6_x;

class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return (leftCondition != null && rightCondition != null) && (leftCondition.match(book) && rightCondition.match(book)); // not sure.. plus need to add empty book checks
    }

}
