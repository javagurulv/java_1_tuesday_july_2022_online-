package student_levs_blinnikovs.lesson_7_classes_and_objects.level_1_intern.task_1.piggybank;

import java.util.Arrays;

class PiggyBankV2 {

    private Coin[] coins;

    public PiggyBankV2(int coinCapacity) {
        this.coins = new Coin[coinCapacity];
    }

    public void addCoin(Coin coin) {                                    // TODO: run addition only when place exist, run error when full
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == null) {                                     // TODO: when there is a place in this cell
                coins[i] = coin;
                break;
            }
        }
    }

//    private boolean isPiggyBankFull() {
//        boolean piggyBankFullInd = true;
//        for (int i = 0; i < coins.length; i++) {
//            if (getCoin(i) == null) {
//                piggyBankFullInd = false;
//                break;
//            }
//        }
//        return piggyBankFullInd;
//    }

        public int getAmountOfMoneyInCents () {
            int denominationSum = 0;
            for (int i = 0; i < coins.length; i++) {
                if (coins[i] != null) {                                               // TODO: checks on piggy bank cell is not empty.. meaning run calc only on real coins
                    if (coins[i].getTitle().equalsIgnoreCase("EUR")) {
                        denominationSum += (coins[i].getDenomination() * 100);
                    }
                    if (coins[i].getTitle().equalsIgnoreCase("cent")) {
                        denominationSum += coins[i].getDenomination();
                    }
                }
            }
            return denominationSum;
        }
    }
