package student_yurii_panasiuk.lesson_4.level_6_middle;

public class Demo {

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10);

        google.getPriceInformation();

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(1);

        google.getPriceInformation();



}
}