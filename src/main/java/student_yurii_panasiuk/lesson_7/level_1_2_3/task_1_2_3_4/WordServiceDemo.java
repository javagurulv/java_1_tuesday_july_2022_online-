package student_yurii_panasiuk.lesson_7.level_1_2_3.task_1_2_3_4;

class WordServiceDemo {

    public static void main(String[] args) {

        WordService test = new WordService();

    String  text = "aaqwwwwwe + aaqwwwwwe олр шщ aaqwwwwwe  ty 10 10 + + 10 + 10  10 mefdf m mefdf mefdf, ereres , ereres  .,"; // Дана строка с текстом.


       String[] processedText = test.processing (text);
       int coordinates = test.findMaxCoordinates(test.listOfResps(processedText));
       System.out.println(test.findMostFrequentWord(coordinates, processedText));








    }
}
