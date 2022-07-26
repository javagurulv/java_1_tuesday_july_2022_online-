package student_levs_blinnikovs.lesson_7_encapsulation.level_1_4.task_1_8_word_service;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = splitToComparableWords(text);
        return findMostFrequentWord(words);
    }

    private String findMostFrequentWord(String[] words) {
        int maxRepetitionCount = 0;
        String mostFrequentWord = "";
        for (String word : words) {
            int currentWordRepetitionCount = countWordRepetitions(words, word);
            if (currentWordRepetitionCount > maxRepetitionCount) {
                maxRepetitionCount = currentWordRepetitionCount;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }

    private String[] splitToComparableWords(String text) {
        return text.toLowerCase().split("\\W+");
    }

    private int countWordRepetitions(String[] words, String wordToCheck) {
        int wordRepetitionCount = 0;
        for (String word : words) {
            if (word.equals(wordToCheck)) {
                wordRepetitionCount++;
            }
        }
        return wordRepetitionCount;
    }

}
