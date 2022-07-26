package teacher.lesson_4_if_statement.lessoncode.alex.basictestapproach;

public class LightDetector {

    public String detect(int length) {
        if (length > 402 && length <= 500) {
            return "Red";
        } else if (length > 500 && length <= 600) {
            return "Blue";
        } else {
            return "Invisible";
        }
    }

}
