package student_levs_blinnikovs.lesson_7_classes_and_objects.level_1_intern.task_1.piggybank;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PiggyBankV2 {

    private Coin[] coins;

    public PiggyBankV2(int coinCapacity) {
        this.coins = new Coin[coinCapacity];
    }

    public boolean isEmptySlot(int index) {
        return coins[index] == null;
    }

    public boolean isPiggyBankFull() {
        for (int i = 0; i < coins.length; i++) {
            if (isEmptySlot(i)) {
                return false;
            }
        }
        return true;
    }

    public void addCoin(Coin coin) {
        if (!isPiggyBankFull()) {
            for (int i = 0; i < coins.length; i++) {
                if (isEmptySlot(i)) {
                    coins[i] = coin;
                    break;
                }
            }
        } else System.out.println("Can't add " + coin.getDenomination() + " " + coin.getTitle() + " coin - piggy bank is full!");
    }

        public int getAmountOfMoneyInCents () {
            int denominationSum = 0;
            for (int i = 0; i < coins.length; i++) {
                if (!isEmptySlot(i)) {                                                  // running calculation just on slots filled with coins
                    if (coins[i].getTitle().equalsIgnoreCase("EUR")) {
                        denominationSum += (coins[i].getDenomination() * 100);
                    }
                    if (coins[i].getTitle().equalsIgnoreCase("cent")) {
                        denominationSum += coins[i].getDenomination();
                    }
                } else {
                    System.out.println("There are still " + (coins.length - i) + " empty slots in the piggy bank. Nothing to calculate."); // exit loop - stop iterating if there are empty cells - nothing to calculate
                    break;
                }
            }
            return denominationSum;
        }
    }
