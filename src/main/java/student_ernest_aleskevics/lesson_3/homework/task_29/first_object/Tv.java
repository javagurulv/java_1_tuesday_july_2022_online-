package student_ernest_aleskevics.lesson_3.homework.task_29.first_object;

public class Tv {

    String brand;
    double inch, price;
    int guarantee;

    Tv(String brand, double price, double inch, int guarantee){
        this.brand = brand;
        this.price = price;
        this.guarantee = guarantee;
        this.inch = inch;
    }

        void discount(double discount) {
            this.price = this.price - discount;
            System.out.println("Hello! Today we have good offer for you. Popular brand " + this.brand + " New price " + this.price);
        }

        void newOffer(String newBrand, int guaranteeAdd){
            this.brand = newBrand;
            this.guarantee = this.guarantee + guaranteeAdd;
            System.out.println("Sorry but we dont have available TV brand in store what you ask. We can offer: " + this.brand + " and give you guarantee for " + this.guarantee + " years.");
        }


}
