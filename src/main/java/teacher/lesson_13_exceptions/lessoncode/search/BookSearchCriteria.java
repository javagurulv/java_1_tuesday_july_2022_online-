package teacher.lesson_13_exceptions.lessoncode.search;

@FunctionalInterface
public interface BookSearchCriteria {

	boolean satisfy(Book book);

}
