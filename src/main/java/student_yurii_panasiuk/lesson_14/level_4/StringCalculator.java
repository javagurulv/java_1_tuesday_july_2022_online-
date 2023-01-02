package student_yurii_panasiuk.lesson_14.level_4;

import java.util.List;
import java.util.ArrayList;

public class StringCalculator {
    public static int add(String numbers) throws IllegalArgumentException {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        String[] parts = numbers.split(",|\n");
        List<Integer> intList = new ArrayList<>();

        for (String part : parts) {
            try {
                intList.add(Integer.parseInt(part.trim()));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid number format: " + part);
            }
        }
        int sum = 0;
        for (int num : intList) {
            sum += num;
        }
        return sum;
    }
}

