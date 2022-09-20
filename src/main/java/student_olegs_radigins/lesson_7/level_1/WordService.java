package student_olegs_radigins.lesson_7.level_1;

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
