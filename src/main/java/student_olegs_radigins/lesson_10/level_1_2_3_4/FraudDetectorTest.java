package student_olegs_radigins.lesson_10.level_1_2_3_4;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.positiveFraudNameTest();
        fraudDetectorTest.negativeFraudNameTest();
        fraudDetectorTest.positiveMaxAmountTest();
        fraudDetectorTest.negativeMaxAmountTest();
        fraudDetectorTest.positiveFraudCityTest();
        fraudDetectorTest.negativeFraudCityTest();
        fraudDetectorTest.positiveFraudCountryTest();
        fraudDetectorTest.negativeFraudCountryTest();
        fraudDetectorTest.positiveWarningCountryTest();
        fraudDetectorTest.negativeWarningCountryTest();

    }
        void positiveFraudNameTest(){
        Trader fraudTrader = new Trader("Pokemon", "London", "UK");
        Transaction transaction = new Transaction(fraudTrader, 1);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudName(transaction)){
            System.out.println("Fraud name test Ok");
        }else {
            System.out.println("Fraud name test Fail");
        }
    }

    void negativeFraudNameTest(){
        Trader trader = new Trader("NePokemon", "London", "UK");
        Transaction transaction = new Transaction(trader, 1);
        FraudDetector fraudDetector = new FraudDetector();
        if(!fraudDetector.isFraudName(transaction)){
            System.out.println("Not fraud name test Ok");
        }else {
            System.out.println("Not fraud name test Fail");
        }
    }

    void positiveMaxAmountTest(){
        Trader fraudTrader = new Trader("NePokemon", "London", "UK");
        Transaction transaction = new Transaction(fraudTrader, 2000000);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isMoreThanMaximum(transaction)){
            System.out.println("Fraud amount test Ok");
        }else {
            System.out.println("Fraud amount test Fail");
        }
    }

    void negativeMaxAmountTest(){
        Trader fraudTrader = new Trader("NePokemon", "London", "UK");
        Transaction transaction = new Transaction(fraudTrader, 200000);
        FraudDetector fraudDetector = new FraudDetector();
        if(!fraudDetector.isMoreThanMaximum(transaction)){
            System.out.println("Not fraud amount test Ok");
        }else {
            System.out.println("Not fraud amount test Fail");
        }
    }
    void positiveFraudCityTest(){
        Trader fraudTrader = new Trader("NePokemon", "Сидней", "UK");
        Transaction transaction = new Transaction(fraudTrader, 1);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudCity(transaction)){
            System.out.println("Fraud city test Ok");
        }else {
            System.out.println("Fraud city test Fail");
        }
    }

    void negativeFraudCityTest(){
        Trader trader = new Trader("NePokemon", "London", "UK");
        Transaction transaction = new Transaction(trader, 1);
        FraudDetector fraudDetector = new FraudDetector();
        if(!fraudDetector.isFraudCity(transaction)){
            System.out.println("Not fraud city test Ok");
        }else {
            System.out.println("Not fraud city test Fail");
        }
    }

    void positiveFraudCountryTest(){
        Trader fraudTrader = new Trader("Pokemon", "London", "Ямайка");
        Transaction transaction = new Transaction(fraudTrader, 1);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isFraudCountry(transaction)){
            System.out.println("Fraud country test Ok");
        }else {
            System.out.println("Fraud country test Fail");
        }
    }

    void negativeFraudCountryTest(){
        Trader trader = new Trader("NePokemon", "London", "UK");
        Transaction transaction = new Transaction(trader, 1);
        FraudDetector fraudDetector = new FraudDetector();
        if(!fraudDetector.isFraudCountry(transaction)){
            System.out.println("Not fraud country test Ok");
        }else {
            System.out.println("Not fraud country test Fail");
        }
    }

    void positiveWarningCountryTest(){
        Trader fraudTrader = new Trader("Pokemon", "London", "Germany");
        Transaction transaction = new Transaction(fraudTrader, 2200);
        FraudDetector fraudDetector = new FraudDetector();
        if(fraudDetector.isWarningCountry(transaction)){
            System.out.println("Warning country test Ok");
        }else {
            System.out.println("Warning country test Fail");
        }
    }

    void negativeWarningCountryTest(){
        Trader trader = new Trader("NePokemon", "London", "germany");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();
        if(!fraudDetector.isWarningCountry(transaction)){
            System.out.println("Not fraud country test Ok");
        }else {
            System.out.println("Not fraud country test Fail");
        }
    }
}
