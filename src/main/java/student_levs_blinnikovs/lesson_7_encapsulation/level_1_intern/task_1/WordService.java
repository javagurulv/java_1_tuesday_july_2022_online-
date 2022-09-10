package student_levs_blinnikovs.lesson_7_encapsulation.level_1_intern.task_1;

class WordService {

    String[] splitToComparableWords(String text) {
        return text.toLowerCase().split("\\W+");
    }

    int countWordRepetitions(String[] words, String wordToCheck) {
        int wordRepetitionCount = 0;
        for (String word : words) {
            if (word.equals(wordToCheck)) {
                wordRepetitionCount++;
            }
        }
        return wordRepetitionCount;
    }

    public String findMostFrequentWord(String text) {
        String[] words = splitToComparableWords(text);
        int maxRepetitionCount = 0;
        String mostOftenWord = "";
        for (String word : words) {
            int currentWordRepetitionCount = countWordRepetitions(words, word);
            if (currentWordRepetitionCount > maxRepetitionCount) {
                maxRepetitionCount = currentWordRepetitionCount;
                mostOftenWord = word;
            }
        }
        return mostOftenWord;
    }

}
