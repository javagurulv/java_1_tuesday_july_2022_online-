package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class PersonalCodeGenerator {

    private static int lastUniqueTrailing = 0;
    private final int uniqueTrailing;

    PersonalCodeGenerator() {
        lastUniqueTrailing++;
        this.uniqueTrailing = lastUniqueTrailing;
    }

    public String generatePersonalCode(boolean randomTrailing) {
        String datePart = generateDatePart();
        if (randomTrailing) {
            return datePart + "-" + generateRandomTrailPart();
        }
        else {
            return datePart + "-" + generateUniqueTrailPart();
        }
    }

    private String generateDatePart() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyy");
        LocalDateTime now = LocalDateTime.now();
        return formatter.format(now);
    }

    private int generateUniqueTrailPart() {
        return 10000 + uniqueTrailing;
    }

    // To ensure uniqueness could be complex data type PersonalCode that has String + UUID. Advised to use generateUniqueTrailPart()
    private int generateRandomTrailPart() {
        Random random = new Random();
        return 10000 + random.nextInt(89999);
    }



}
