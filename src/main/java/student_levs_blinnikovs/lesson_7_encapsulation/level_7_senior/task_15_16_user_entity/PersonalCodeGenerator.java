package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15_16_user_entity;

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

    /**
     * By Levs B 13/9/2022
     * This method generates Latvian (LV) old format personal code - ddMMyyyy-XXXXX where ddMMyyyy is date of method call and XXXXX is a five-digit number.
     * @param randomTrailing if set as true, random trailing XXXXX part will be used - caution, uniqueness is not implemented there.
     *                       if set as false, trailing will be generated from 10001 to 99999
     * @return returns personal code in aforementioned format
     *
     * Further plans include:   - generate unique random
     *                          - create date as param in overloaded method so not only now() can be used but user specified date
     *
     */
    public String generatePersonalCode(boolean randomTrailing) {
        String datePart = createDatePart();
        if (randomTrailing) {
            return datePart + "-" + generateRandomTrailPart();
        }
        else {
            return datePart + "-" + generateUniqueTrailPart();
        }
    }

    private String createDatePart() {
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
