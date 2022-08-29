package student_sobit_eshniyozov.lesson_4_if_statement.level_5;

class LightColorDetector {

//380 ... 449 - Фиолетовый ("Violet")
//450 ... 494 - Синий ("Blue")
//495 ... 569 - Зеленый ("Green")
//570 ... 589 - Желтый ("Yellow")
//590 ... 619 - Оранжевый ("Orange")
//620 ... 750 - Красный ("Red")
//    Вне диапазонов - невидимый спектр ("Invisible Light")

    public String detector(int number) {
        if ((380 <= number) && (number <= 449)) {
            return "Violet";
        } else if (450 <= number && number <= 494) {
            return "Blue";
        } else if (495 <= number && number <= 569) {
            return "Green";
        } else if (570 <= number && number <= 589) {
            return "Yellow";
        } else if (590 <= number && number <= 619) {
            return "Orange";
        } else if (620 <= number && number <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}