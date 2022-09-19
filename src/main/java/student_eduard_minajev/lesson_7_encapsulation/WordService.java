
package student_eduard_minajev.lesson_7_encapsulation;

public class WordService {


// Разбиваем строку на слова
    public String[] splitStringToWords (String text){
        return text.toLowerCase().split("\\W+");
    }

    // гуглил.
    public String findMostFrequentWord(String text) {
        String [] words = splitStringToWords(text);
        int maxRepetitions = 0;
        String mostRepeatedWord = null;
        for (int i = 0; i < words.length; i++){
            String temp = words [i];
            int count = 1;
            for (int j = 0; j < words.length; j++) {
                if (temp.equals(splitStringToWords(text)))
                    count++;
            }
            if (maxRepetitions < count) {
                maxRepetitions = count;
                mostRepeatedWord = temp;
            }

        } return mostRepeatedWord;
    }

}
