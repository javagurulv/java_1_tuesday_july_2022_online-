package student_yurii_panasiuk.lesson_12.level_2_3_4_5_6;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }
    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book) ;
        }


}