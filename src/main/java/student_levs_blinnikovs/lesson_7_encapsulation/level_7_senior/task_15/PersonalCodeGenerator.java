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

    private String generateDatePart() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyy");
        LocalDateTime now = LocalDateTime.now();
        return formatter.format(now);
    }

    private int generateRandomTrailPart() {
        Random random = new Random();
        return 10000 + random.nextInt(89999); // currently generates from 10000 to 99999 TODO make possible from 00001 to 99999 maybe with some String 00000 and then based on int has 1 .. 5 digits, make further manipulations
    }  // To ensure uniqueness needs to be complex data type PersonalCode that has UUID, or to do some increments here as well .. maybe using ID

    private int generateUniqueTrailPart() {
        return 10000 + uniqueTrailing;
    }

    String generatePersonalCode(boolean randomTrailing) {
        String datePart = generateDatePart();
        if (randomTrailing) {
            return datePart + "-" + generateRandomTrailPart();
        }
        else {
            return datePart + "-" + generateUniqueTrailPart();
        }
    }

}
