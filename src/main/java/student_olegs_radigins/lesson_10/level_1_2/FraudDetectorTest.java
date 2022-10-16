package student_olegs_radigins.lesson_10.level_1_2;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.positiveFraudNameTest();
        fraudDetectorTest.negativeFraudNameTest();

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
}
