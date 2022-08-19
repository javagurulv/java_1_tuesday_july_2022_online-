package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

class Product {
    String name;
    double regularPrice;
    double discount;
    Product(String name){
        this.name = name;
    }
    double actualPrice(){return  this.regularPrice-this.regularPrice*this.discount/100;}

    void setRegularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }
    void setDiscount(double discount){
        this.discount = discount;
    }
    void printInformation(){
            System.out.println("Price of "+name+" with "+this.discount+" % discount: "+this.actualPrice()+" euro, "+"and without discount: "+this.regularPrice+" euro");
    }







}
