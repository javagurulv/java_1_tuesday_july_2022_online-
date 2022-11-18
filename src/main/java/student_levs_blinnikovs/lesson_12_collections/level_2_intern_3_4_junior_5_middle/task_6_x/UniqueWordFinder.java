package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_middle.task_6_x;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {
        return new LinkedHashSet<>(Arrays.asList(text.toLowerCase().split("\\W+")));
    }

}
