

package student_eduard_minajev.lesson_7_encapsulation;

public class WordService {


// Разбиваем строку на слова
    public String[] splitStringToWords (String text){
        return text.toLowerCase().split("\\W+");
    }


/*
    public String findMostFrequentWord(String text) {
        String [] words = splitStringToWords(text)
    }
*/
}
