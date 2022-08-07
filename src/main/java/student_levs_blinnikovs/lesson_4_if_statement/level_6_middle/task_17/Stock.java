package student_levs_blinnikovs.lesson_4_if_statement.level_6_middle.task_17;

/*
Необходимо реализовать класс Stock ("акция") таким образом,
чтобы была возможность узнать текущую цену акции,
а также ее максимальную и минимальную стоимость
за период существования.

Класс Stock должен обладать следующими характеристиками:

Свойства:
- Имя компании
- Текущая стоимость
- Минимальная стоимость
- Максимальная стоимость

Методы:
- Обновить текущую стоимость акции updatePrice()
- Получить информацию об акции getPriceInformation()

Имя компании и начальную стоимость необходимо
задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость
должны меняться только через метод updatePrice().

Написать тестовые сценарии для класса Stock в классе StockTest.


10 -> 12 -> 5 -> 7 -> 99 -> 77

Test case max:

Изменение цены акции: 999  = Максимальная цена за указанный период: 999
Изменение цены акции: 999 -> 1  = Максимальная цена за указанный период: 999
Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный период: 1000
Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный период: 1000
Изменение цены акции: 9 -> 27 = Максимальная цена за указанный период: 27


Пример работы с классом Stock:

Stock google = new Stock("GOOG", 10);
String priceInformation = google.getPriceInformation();
System.out.println(priceInformation);
​
google.updatePrice(15);
google.updatePrice(7);
google.updatePrice(14);
​
priceInformation = google.getPriceInformation();
System.out.println(priceInformation);

После выполнения кода вывод в консоли должен быть следующим:
Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15
 */

import teacher.codereview.CodeReviewComment;

class Stock {

    @CodeReviewComment(student = "Should create additional startingPrice and set via constructor, and then updatePrice will manipulate the current price?")
    Stock(String companyName, int currentStockPrice) {
        this.companyName = companyName;
        this.currentStockPrice = currentStockPrice;
        System.out.println("|----------MARKET UPDATE--------------");
        System.out.println("| New stock on the market!");
        System.out.println("| \"" + companyName + "\" is now selling for " + currentStockPrice);
        System.out.println("|-------------------------------------\n");
    }

    final String companyName;
    int currentStockPrice;
    int minimumStockPrice;
    int maximumStockPrice;

    void updatePrice(int currentStockPrice) {
        System.out.println("|----------PRICE UPDATE---------------");
        System.out.println("| " + companyName + " stock price changing from " + this.currentStockPrice + " to " + currentStockPrice);
        this.currentStockPrice = currentStockPrice;
        System.out.println("| " + companyName + " stock price update has finished. Current price is " + this.currentStockPrice);
        System.out.println("|-------------------------------------\n");
    }

    void getPriceInformation() {
        System.out.println("|----------" + companyName + " MARKET INFO-----------");
        System.out.println("| Company = \"" + companyName + "\", Current Price = " + currentStockPrice + ", Min Price = " + minimumStockPrice + ", Max Price = " + maximumStockPrice);
        System.out.println("|-------------------------------------\n");
    }

}
