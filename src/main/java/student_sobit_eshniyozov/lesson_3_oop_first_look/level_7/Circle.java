package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;
import java.lang.Math;

class Circle {
    double radius;
    double pi = 3.14;
    Circle(double radius){
        this.radius = radius;
        }
    void calculateArea(){

        double result=this.pi*Math.pow(this.radius,2);
        System.out.println("Area of circle is: "+result);
    }


}
