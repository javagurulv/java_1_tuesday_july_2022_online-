package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_4_junior.task_20;

import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WhileLoopContinue {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        String[] strangerPhrases = {"Hi!", "How are you?", "Long time no see!", "Hello..."};

        boolean isUserLoggedIn = true;

        System.out.println("Welcome to the chat!");
        System.out.println("Swear words will be ignored!");
        System.out.println("Starting chatting with stranger... say hi!");

        while (isUserLoggedIn) {
            String userMessage = userInput.next();
            if (userMessage.equals("Fool!")) {
                System.err.println("You can't say that! Ignored!");
                continue;
            } else if (userMessage.equals("Bye!")) {
                System.out.println("See you around!");
                break;
            }
            System.out.println("Stranger says: " + strangerPhrases[random.nextInt(4)]);
        }
    }
}
