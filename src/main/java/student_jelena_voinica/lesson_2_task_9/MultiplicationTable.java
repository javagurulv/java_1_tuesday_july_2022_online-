package student_jelena_voinica.lesson_2_task_9;
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[]args){

        System.out.println("Input a number");

        Scanner in = new Scanner(System.in);
        int num  = in.nextInt();


            for (int i = 1; i <=10; i++){
            for (int j = 1; j <=10; j++)

                System.out.println(i + "*" + j + "=" + i * j);

        }
    }

    }

