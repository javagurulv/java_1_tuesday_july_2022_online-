package student_levs_blinnikovs.lesson_8_inheritance.level_6_middle.task_30;

class VarargsDemo {

    void printPhrase(String ... words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    public static void main(String[] args) {

        VarargsDemo demo = new VarargsDemo();

        demo.printPhrase();
        demo.printPhrase("Hi!");
        demo.printPhrase("Hello,", "how", "are", "you?");

    }
}
