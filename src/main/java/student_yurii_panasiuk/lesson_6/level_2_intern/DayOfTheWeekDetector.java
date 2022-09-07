package student_yurii_panasiuk.lesson_6.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class DayOfTheWeekDetector {

	@CodeReviewComment(teacher = "Этот код лучше убрать в Demo класс, так как это часть программы "
			+ "взаимодействия с пользователем.")
    int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    String findDayOfTheWeek(int dayNumber) {
        String dayOfTheWeek;
        switch (dayNumber) {
            case 1 -> dayOfTheWeek = "Monday";
            case 2 -> dayOfTheWeek = "Tuesday";
            case 3 -> dayOfTheWeek = "Wednesday";
            case 4 -> dayOfTheWeek = "Thursday";
            case 5 -> dayOfTheWeek = "Friday";
            case 6 -> dayOfTheWeek = "Saturday";
            case 7 -> dayOfTheWeek = "Sunday";
            default -> dayOfTheWeek = "Not correct day number";
        }
            return dayOfTheWeek;

    }
}
