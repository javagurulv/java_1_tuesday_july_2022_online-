package student_yurii_panasiuk.lesson_11.level_2.task_4;

class DayOfTheWeekDetectorIfVersion2 implements DayOfTheWeekDetector{

        @Override
        public String detectDayName(int number) {



                        return switch (number) {
                                case 1 -> "Monday";
                                case 2 -> "Tuesday";
                                case 3 -> "Wednesday";
                                case 4 -> "Thursday";
                                case 5 -> "Friday";
                                case 6 -> "Saturday";
                                case 7 -> "Sunday";
                                default -> "Please input a valid number between 1 and 7";
                        };
        }
}

