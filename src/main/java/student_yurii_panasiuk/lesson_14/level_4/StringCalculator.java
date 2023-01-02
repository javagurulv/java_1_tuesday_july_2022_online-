package student_yurii_panasiuk.lesson_14.level_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Метод может принимать до двух чисел разделённые запятой и возвращает их сумму.
Пример входной строки: “” or “1” or “1,2”. Для пустой строки сумма равна 0.
 */
 class StringCalculator {
    int add(String numbers) throws Exception {
        if (numbers.isEmpty()) {
            return 0;
        }
        Pattern pattern = Pattern.compile("(-?\\d+),(-?\\d+)");
        Matcher matcher = pattern.matcher(numbers);
        if (matcher.matches()) {
            int n1 = Integer.parseInt(matcher.group(1));
            int n2 = Integer.parseInt(matcher.group(2));
            return n1 + n2;
        } else {
            pattern = Pattern.compile("-?\\d+");
            matcher= pattern.matcher(numbers);
            if (matcher.matches()) {
                return Integer.parseInt(matcher.group(0));
            } else {
                throw new Exception("Invalid input: " + numbers);
            }
        }
    }
}
