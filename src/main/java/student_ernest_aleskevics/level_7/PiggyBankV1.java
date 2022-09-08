package student_ernest_aleskevics.level_7;

 class PiggyBankV1 {

    private int amountOfMoneyInCents;

     public PiggyBankV1() {
         this.amountOfMoneyInCents = 0;
     }

     public void addCoin(Coin coin){
         if(coin.getTitle().equalsIgnoreCase("cent")) {
             this.amountOfMoneyInCents = coin.getDenomination();
         } if(coin.getTitle().equalsIgnoreCase("EUR")){
             this.amountOfMoneyInCents = (coin.getDenomination() * 100);
         }
     }

     public int getAmountOfMoneyInCents() {
         return this.amountOfMoneyInCents;
     }


}
