/*Разработать класс - продукт,
        у которого должны быть следующие характеристики:
        Свойства:
        - Наименование (String name)
        - Стандартная цена (double regularPrice)
        - Скидка в процентах (double discount)
        Методы:
        1. Расчет актуальной стоимости с учетом скидки (double actualPrice()).
        2. Вывод информации о продукте в консоль (void printInformation()).
        3. Название продукта нужно задавать через конструктор.
        4. Стоимость и скидку нужно задавать через соответствующие методы.
        Класс с объявлением продукта должен называться "Product".
        Класс с демонстрацией работы должен называться "ProductDemo".
        */


package student_yurii_panasiuk.lesson_3.level_7_senior.task_31;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
     class Product {

         String name;
         double regularPrice;
         double discount;

	@CodeReviewComment(teacher = "Зачем это свойство? Где оно используется?")
         double actualPrice0;

         public Product(String name) {
             this.name = name;
             //this.regularPrice = regularPrice;
            // this.discount = discount;
         }


         void setRegularPrice (double regularPrice) {

             this.regularPrice = regularPrice;

         }

         void setDiscount (double discount) {

             this.discount = discount;

         }

         void printInformation() {
             double actualPrice = this.regularPrice-((this.regularPrice/100)* this.discount);
             System.out.println ("Наименование " + this.name);
             System.out.println ("Стандартная цена " + this.regularPrice);
             System.out.println ("Скидка в процентах " + this.discount);
             System.out.println ("Актуальная стоимость " + actualPrice);
         }
     }
