package com.company;

import java.util.Scanner;

public class ATM {
    private Bank bank;
    private Scanner sc;
    private long cardNumber;


    public ATM(Bank bank) {
        this.bank = bank;
        this.sc = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Введите номер карточки");
        this.cardNumber = this.sc.nextLong();
        if (!this.bank.isCardExist(this.cardNumber)) {
            System.out.println("Неверный номер карты");
            return;
        }
        this.showPinCodeMenu();
    }

    private void showPinCodeMenu() {
        int retriesCount = 3;
        while (retriesCount > 0) {
            System.out.println("Введите пин-код. Осталось попыток: " + retriesCount);
            int pin = this.sc.nextInt();
            if (this.bank.chekPin(this.cardNumber, pin)) {
                this.showMainMenu();
                return;
            }
            retriesCount--;
            System.out.println("Неверный пин-код!");
        }
        System.out.println("Ваша карта заблокирована!");
    }

    private void showMainMenu() {
        int menuOption = 0;
        while (menuOption != 3) {
            System.out.println("1. Состояяние счета");
            System.out.println("2. Снятие наличных");
            System.out.println("3. Завершить работу");
            menuOption = sc.nextInt();
            switch (menuOption) {
                case 1:
                    System.out.println("Ваш баланс: " + this.bank.getCardBalance(this.cardNumber));
                    break;
                case 2:
                    System.out.println("Введите сумму наличных");
                    long amount = this.sc.nextLong();
                    System.out.println("Остаток: " + this.bank.changeBalance(this.cardNumber, amount));
                    break;
                case 3: break;
                    default:
                        System.out.println("Неверный ввод");
            }
        }
    }
}
