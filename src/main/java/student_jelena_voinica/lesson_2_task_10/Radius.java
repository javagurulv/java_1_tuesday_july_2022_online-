package student_jelena_voinica.lesson_2_task_10;
import java.util.Scanner;
public class Radius {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String []args){
        System.out.println("Enter Radius");

        double radius = scanner.nextDouble();
        double area = Math.PI * (radius * radius);

        System.out.println("Area is = " + area);

        double perimetr = radius * 2 * Math.PI;

        System.out.println("Perimetr is = " + perimetr);
        }
    }

