package com.company;

public class Animal {

    public String name; // динамическое поле
    public static String color; // статическое поле


    public static int age ;
    static { // статические полня не насоедуются
         age = 12;
        System.out.println(age);
    }

    public static void run() {
        System.out.println("animal is running");
    }
}
