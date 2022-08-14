package student_yurii_panasiuk.lesson_3.level_7_senior.task_30;

/*Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
 */

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
 class Circle {

	@CodeReviewComment(teacher = "Зачем тут присваивается 1?")
     double radius = 1;

     Circle(double radius) {
         this.radius = radius;
     }

	 @CodeReviewComment(teacher = "В названии метода должен присутствовать глагол!")
     void circleArea () {

         double circleArea = Math.PI * Math.pow(radius, 2);

         System.out.println ("Площадь курга с радиусом " + radius + " равна  "+ circleArea);
     }
 }
