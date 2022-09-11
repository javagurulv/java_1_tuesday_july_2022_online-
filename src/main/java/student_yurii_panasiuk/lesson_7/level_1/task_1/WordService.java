package student_yurii_panasiuk.lesson_7.level_1.task_1;


import java.util.HashMap;

/*     Дана строка с текстом.
        Написать метод, который находит слово
        в тексте встречающееся больше всего раз.

        Если несколько слов в тексте встречаются одинаково
        максимальное число раз, то возвращаем, то слово,
        которое встречается в тексте первым.

  */
class WordService {

    void wordCounter(String text) {

        String[] words = text.replaceAll("[-.?!)(,:]", "").split("\\s+");
        //Метод split возвращает массив String (слов в данном случае), поэтому нет необходимости вручную добавлять слова в массив.
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " " + wordToCount.get(word));
        }

    }
}
