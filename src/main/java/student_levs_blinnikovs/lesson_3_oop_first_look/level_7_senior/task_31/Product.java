package student_levs_blinnikovs.lesson_3_oop_first_look.level_7_senior.task_31;

/*
Разработать класс - продукт,
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

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return this.regularPrice * (1 - this.discount);
    }

    void printInformation() {
        System.out.println("This is " + name + ". It costs " + regularPrice + " without discount and " + this.actualPrice() + " with discount of " + discount + "%.");
    }

    void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    void setDiscount(double discount) {
        this.discount = discount;
    }
}


