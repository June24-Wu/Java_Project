package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Mortgage();
//        FizzBuzz();
    }
    /*
    Mortgage
     */
    public static void Mortgage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Principle: ");
        float principle = sc.nextFloat();
        while (principle <= 1000 || principle >= 100_000_000){
            System.out.println("please input a number from 1000 to 1000000");
            System.out.println("Principle: ");
            principle = sc.nextFloat();
        }
        System.out.println("Annual Interest Rate: ");
        double rate = sc.nextFloat();
        while (rate <= 0 || rate > 30){
            System.out.println("please input a number from 0 to 30");
            System.out.println("Annual Interest Rate: ");
            rate = sc.nextFloat();
        }
        rate = rate / 1200;
        System.out.println("Period (Year): ");
        double month = sc.nextFloat();
        while (month <= 0 || month > 30){
            System.out.println("please input a number from 0 to 30");
            System.out.println("Period (Year):");
            month = sc.nextFloat();
        }
        month = month * 12;
        double mortgage = principle * Math.pow((1+rate),month) * rate / (Math.pow((1+rate),month) - 1);
        String currency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(currency);
    }
    public  static  void FizzBuzz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int input = sc.nextInt();
        if (input % 3 == 0 && input % 5 == 0 )
            System.out.println("FizzBuzz");
        else if (input % 5 == 0)
            System.out.println("Fizz");
        else if (input % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(input);
    }
}
