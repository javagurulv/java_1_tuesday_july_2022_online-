package student_yurii_panasiuk.lesson_7.level_1_2_3.task_1_2_3_4;


import java.util.*;

/*     Дана строка с текстом.
        Написать метод, который находит слово
        в тексте встречающееся больше всего раз.

        Если несколько слов в тексте встречаются одинаково
        максимальное число раз, то возвращаем, то слово,
        которое встречается в тексте первым.

  */
class WordService {


    String [] processing (String text) {
        String[] words = text.replaceAll("[-.?!)(,:]", "").split("\\s+");
      return  words;

      //  (Arrays.toString(words));
           }



    ArrayList<Integer> listOfResps (String []words){ // создаем список, вместо слов - количество повторений слова
               int reps = 0;
               ArrayList<Integer> listOfReps = new ArrayList<Integer>();
              // HashMap<String, Integer> wordToCount = new HashMap<>();
               for (int i = 0; i < words.length; i++) {
                   reps = 0;
                   for (int j = 0; j < words.length; j++) {
                       if (words[i].equals(words[j])) {
                           reps++;
                       }
               }
                   listOfReps.add (reps);
           }
       // System.out.println(listOfReps);
        return listOfReps;
    }

    Integer findMaxCoordinates (List<Integer> listOfReps){
        int maxCoordinates = 0;
        for (int i = 0; i < listOfReps.size(); i++) {
          //  System.out.print (i + "  ");
          //  System.out.print(listOfReps.get(i) + " ");
          //  System.out.println(maxCoordinates + "  ");
                if(listOfReps.get(i) > listOfReps.get(maxCoordinates)) {
                    maxCoordinates = i;
                }

        }
       // System.out.println(maxCoordinates);
        return maxCoordinates;
    }

    String findMostFrequentWord (int maxCoordinates, String [] words){
        return words[maxCoordinates];

    }


}

/*
    HashMap<String,Integer> findMostFrequentWord (String[] words){
    String mostFrequentWord = null;
   int reps = 0;
   int mostFrequentWordCounter = 0;
   HashMap<String, Integer> wordToCount = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
        reps = 0;
        for (int j = 0; j < words.length; j++) {
            if (words[i].equals(words[j])) {
                reps++;
                mostFrequentWordCounter++;
            }
                wordToCount.put(words[i], reps);


            } }
        return wordToCount;
        }
    }

 */



    /*       void getMostFrequentWord (String [] words) {
        HashMap<String, Integer> wordToCount = new HashMap<>();

        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);

        }
        System.out.println(wordToCount); // Почему тут беспорядок такой в этом хэше? слова как попало записаны !!
    }

/*
       String mostFrequentWord = null;
       int mostFrequentWordCounter = 0;
        for (int i = 0; i < words.length; i++) {
            int reps = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    reps++;
                    mostFrequentWord = words[i]
                    mostFrequentWordCounter++

                }
            }

     */





       // int maxReps=(Collections.max(wordToCount.values()));










      //  System.out.println(maxReps);

     /*   for (Map.Entry<String, Integer> entry : wordToCount.entrySet()) {
            if (entry.getValue()==maxReps) {
                System.out.println(entry.getKey());
            }
        }

      */
    /*    Map.Entry<String, Integer> mostFrequentWord = null;
        for (Map.Entry<String, Integer> entry : wordToCount.entrySet()) {

            if (mostFrequentWord == null || entry.getValue() > mostFrequentWord.getValue()) {
                mostFrequentWord = entry;
               // System.out.println(mostFrequentWord);
            }
        }
        System.out.println(mostFrequentWord);

     */



      /*  for (String word : wordToCount.keySet())
        {
            if (i < wordToCount.get(word)) {
                i = wordToCount.get(word) ;
                mostFrequentWord = word;

                System.out.println(mostFrequentWord + " " + i);
            }
                   }
      // return mostFrequentWord;

       */





