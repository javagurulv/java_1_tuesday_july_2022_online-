package student_olegs_radigins.lesson_12.level_2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class UniqueWordFinder {
    Set<String> find(String text) {
        return new HashSet<String>(List.of(text.split("[, ?.@]+")));

    }
}
