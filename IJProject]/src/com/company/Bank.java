package com.company;

public class Bank {
    private static Card[] cards;

    static {
        cards = new Card[] {
                new Card(1234, 1111, 12500),
                new Card(3456, 1212, 1000),
                new Card(5657, 2121,1000000)
        };
    }

    public boolean isCardExist(long cardNumber) {
        for (Card card : Bank.cards) {
            if (cardNumber == card.getNumberCard()) {
                return true;
            }
        }

        return false;
    }

    public boolean chekPin(long cardNumber, int pin) {
        for (Card card : Bank.cards) {
            if (cardNumber == card.getNumberCard()) {
                return pin == card.getPinCode();
            }
        }

        return false;
    }

    public long changeBalance(long cardNumber, long amount) {
        for (Card card : Bank.cards) {
            if (cardNumber == card.getNumberCard()) {
                long balance = card.getBalance() - amount;
                if (balance < 0) {
                    System.out.println("Недостаточно средств");
                } else {
                    card.setBalance(balance);
                }
                return card.getBalance();
            }
        }
        return 0;
    }

    public long getCardBalance(long cardNumber) {
        for (Card card : Bank.cards) {
            if (cardNumber == card.getNumberCard()) {
                return card.getBalance();
            }
        }
        return 0;
    }
}
