package student_yurii_panasiuk.lesson_2.level_7;
import java.util.Scanner; // инициализация функции сканера

//the distance (in a straight line) between two points on a plane in Cartesian coordinates
public class Task32_33 {

/* создаем функцию которая:
содержит параметры в виде координат x,y для двух точек
возвращает растояние между двумя точками
 */
    public static double distanse (double x1, double y1, double x2, double y2){
        double distanse;
        distanse = Math.pow (((Math.pow((x1 - x2),2)) + (Math.pow((y1 - y2),2))) , 0.5);
        return distanse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the coordinates of the first point X,Y"); // the coordinates of the first point
        double pointOneX = scanner.nextDouble();
        double pointOneY = scanner.nextDouble();


        System.out.println("enter the coordinates of the second point X,Y");  // the coordinates of the second point
        double pointTwoX = scanner.nextDouble();
        double pointTwoY = scanner.nextDouble();

        double answer = distanse(pointOneX,pointOneY,pointTwoX,pointTwoY); //calling a function with parameters
        System.out.println("the distance is " + answer);

    }
}
