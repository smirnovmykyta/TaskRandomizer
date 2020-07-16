package com.gmail.mykyta.smirnov.Randomizer;

public class RandomNumber {
    public static void randomNumber() {
        System.out.println(Math.random());
        System.out.println("===========");
    }

    public static void tenRandomNumbers(){
        for (int counter = 0 ; counter < 10; counter++ ){
            System.out.println("Number " + (counter+1) + " : "  + Math.random());
        }
        System.out.println("===========");
    }

    public static  void tenRandomNumbersFromZeroToTen() {
        for (int counter = 0 ; counter < 10; counter++ ){
            System.out.println("Number " + (counter+1) + " : "  + ((int)(Math.random() * 11)));
        }
        System.out.println("===========");
    }

    public static void tenRandomNumbersFromTwentyToFifty(){
        for (int counter = 0 ; counter < 10; counter++ ){
            System.out.println("Number " + (counter+1) + " : "  + ( 20 + (int)(Math.random() * 31)));
        }
        System.out.println("===========");
    }

    public static void tenRandomNumbersFromMinusTenToTen() {
        for (int counter = 0 ; counter < 10; counter++ ){
            System.out.println("Number " + (counter+1) + " : "  + (int)(Math.random() * 21 - 10));
        }
        System.out.println("===========");
    }

    public static void randomAmountNumbersFromMinusTenToThirtyFive(){
        int amountNumber = 3 + (int)(Math.random() * 15);
        for (int counter = 0 ; counter < amountNumber; counter++ ){
            System.out.println("Number " + (counter+1) + " : "  + (int)(Math.random() * 46 - 10));
        }
        System.out.println("===========");
    }
}
