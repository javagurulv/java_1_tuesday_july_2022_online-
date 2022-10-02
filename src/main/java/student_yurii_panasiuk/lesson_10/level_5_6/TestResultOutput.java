package student_yurii_panasiuk.lesson_10.level_5_6;

 class TestResultOutput {

    static void testResult(boolean check) {
        if (check) {
            System.out.println(" OK");
        } else {
            System.out.println(" FAIL");
        }
    }

     static void transactionDataOutput (Transaction transactiontoOunput) {

         System.out.println("Trader name - " +   transactiontoOunput.getTrader().getFullName());

         System.out.println("Trader city - " + transactiontoOunput.getTrader().getCity());

         System.out.println("Trader state - " +  transactiontoOunput.getTrader().getState());

         System.out.println("Transaction volume - " +  transactiontoOunput.getAmount());

     }
}
