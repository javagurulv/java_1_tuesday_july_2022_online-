package student_yurii_panasiuk.lesson_12.level_2_3_4;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text){
        String[] arrayOfString = text.split("[, ?.@]+");
        Set<String> uniqueWordsSet = new HashSet<>();
        for (String word : arrayOfString) {
            uniqueWordsSet.add(word);
        }
    return uniqueWordsSet;
    }
}
