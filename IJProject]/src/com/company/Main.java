package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        ATM atm = new ATM(bank);
        atm.start();
        // Статические элементы STATIC
//        Animal a = new Animal();
//        a.name = "tom";
//        a.color = "red";
//        Animal.color = "green"; // обращение к стачическому полу через имя класса
//        Animal.run(); // вызов статического метода
//        Animal a2 = new Animal();
//        System.out.println(a2.color); // статические поля, существкуют в памяти в единственном экземпляре
//        // и доступ к ним осуществляется на уровне класса (не объекта класса)
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("введите любое число");
//        int number =  sc.nextInt();
//        System.out.println("Введите любую строку");
//        String str = sc.next();
//        System.out.println(number + " " + str);


    }
}
