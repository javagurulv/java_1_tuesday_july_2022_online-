package student_levs_blinnikovs.lesson_8_inheritance.level_6_middle.task_30;

class VarargsDemo {

    static void varargsPrintPhrase(String ... words) {

        for (String word : words) {
            System.out.print(word + " ");
        }

    }

    public static void main(String[] args) {

        varargsPrintPhrase("Hi!");

        varargsPrintPhrase("Hello,", "how", "are", "you", "?");

        varargsPrintPhrase();


    }
}
