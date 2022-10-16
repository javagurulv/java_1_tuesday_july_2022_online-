package student_olegs_radigins.lesson_10.level_1_2_3;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.positiveFraudNameTest();
        fraudDetectorTest.negativeFraudNameTest();
        fraudDetectorTest.positiveMaxAmountTest();
        fraudDetectorTest.negativeMaxAmountTest();
        fraudDetectorTest.positiveFraudCityTest();
        fraudDetectorTest.negativeFraudCityTest();

    }
        void positiveFraudNameTest(){
        Trader fraudTrader = new Trader("Pokemon", "London");
        Transaction transaction = new Transaction(fraudTrader, 1);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudName(transaction) == true){
            System.out.println("Fraud name test Ok");
        }else {
            System.out.println("Fraud name test Fail");
        }
    }

    void negativeFraudNameTest(){
        Trader trader = new Trader("NePokemon", "London");
        Transaction transaction = new Transaction(trader, 1);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudName(transaction) == false){
            System.out.println("Not fraud name test Ok");
        }else {
            System.out.println("Not fraud name test Fail");
        }
    }

    void positiveMaxAmountTest(){
        Trader fraudTrader = new Trader("NePokemon", "London");
        Transaction transaction = new Transaction(fraudTrader, 2000000);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isMoreThanMaximum(transaction) == true){
            System.out.println("Fraud amount test Ok");
        }else {
            System.out.println("Fraud amount test Fail");
        }
    }

    void negativeMaxAmountTest(){
        Trader fraudTrader = new Trader("NePokemon", "London");
        Transaction transaction = new Transaction(fraudTrader, 200000);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isMoreThanMaximum(transaction) == false){
            System.out.println("Not fraud amount test Ok");
        }else {
            System.out.println("Not fraud amount test Fail");
        }
    }
    void positiveFraudCityTest(){
        Trader fraudTrader = new Trader("NePokemon", "Сидней");
        Transaction transaction = new Transaction(fraudTrader, 1);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudCity(transaction) == true){
            System.out.println("Fraud city test Ok");
        }else {
            System.out.println("Fraud city test Fail");
        }
    }

    void negativeFraudCityTest(){
        Trader trader = new Trader("NePokemon", "London");
        Transaction transaction = new Transaction(trader, 1);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudCity(transaction) == false){
            System.out.println("Not fraud city test Ok");
        }else {
            System.out.println("Not fraud city test Fail");
        }
    }
}
