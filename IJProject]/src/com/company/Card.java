package com.company;

public class Card {
    private long numberCard;
    private int pinCode;
    private long balance;

    public Card(long numberCard, int pinCode, long balance) {
        this.balance = balance;
        this.numberCard = numberCard;
        this.pinCode = pinCode;
    }

    public long getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(long numberCard) {
        this.numberCard = numberCard;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
