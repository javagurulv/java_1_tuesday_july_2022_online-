package student_olegs_radigins.lesson_7.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text = "aa bb ccc bb bb bb aa aa";
        System.out.println(wordService.findMostFrequentWord(text));


    }
}
