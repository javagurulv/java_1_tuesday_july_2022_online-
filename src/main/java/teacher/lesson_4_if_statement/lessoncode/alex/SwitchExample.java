package teacher.lesson_4_if_statement.lessoncode.alex;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean moveOn = true;
        SwitchExample switchExample = new SwitchExample();

        while (moveOn) {
            switchExample.printMenu();
            System.out.println("Type your option...");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Type new product name...");
                    break;
                case 2:
                    System.out.println("Type search criteria");
                    break;
                case 3:
                    System.out.println("Are you sure?");
                    break;
                case 4:
                    System.out.println("This is Milk");
                    break;
                case 5:
                    moveOn = false;
                    break;
                default:
                    System.out.println("No such option...");
            }
        }
    }

    public void printMenu() {
        System.out.println("1 - Add Product");
        System.out.println("2 - Find Product");
        System.out.println("3 - Delete Product");
        System.out.println("4 - Get Product info");
        System.out.println("5 - For Exit");
    }
}
