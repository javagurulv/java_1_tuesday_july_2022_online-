package student_ernest_aleskevics.lesson_3.homework.task_29.second_object;

class Apple {
    String countryOfOrigin, colour;
    double pricePerKilogram;

    Apple(String countryOfOrigin, String colour, double pricePerKilogram){
        this.countryOfOrigin = countryOfOrigin;
        this.colour = colour;
        this.pricePerKilogram = pricePerKilogram;
    }

    void customerTakeMoreThanOneKilogram (int kilograms) {
        this.pricePerKilogram = pricePerKilogram * kilograms;
        System.out.println(this.countryOfOrigin + " apple " + kilograms + " kilograms will cost " + this.pricePerKilogram);
    }

}
