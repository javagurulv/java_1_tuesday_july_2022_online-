package student_eduard_minajev.Lesson_02.homework.level_3;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final double Pi = 3.1415; //задаю константу Пи для дальнейшего
        System.out.println("Let's find customized circle's perimeter and square!");
        System.out.println("Please provide circle radius!");
        double circleRadius = scanner.nextDouble();
        double circlePerimeter = 2 * Pi * circleRadius;
        int exponent = 2;// задаю экспоненту для возведения в степень радиуса
        double circleRadiusSquared = Math.pow(circleRadius, exponent); // возвожу радиус в степень экспоненты
        double circleSquare = Pi * circleRadiusSquared; //перемножаю константу с результатом возведения в степень
        System.out.println("Constructed circle's perimeter is : " + circlePerimeter);
        System.out.println("Constructed circle's square is: " + circleSquare);




    }
}
