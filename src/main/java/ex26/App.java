/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Chris Mathew
 */
package ex26;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your balance? ");
        double balance = in.nextDouble();
        System.out.println("What is the APR on your card (as a percent)? ");
        double apr = in.nextDouble();
        System.out.println("What is the monthly payment you make? ");
        double payment = in.nextDouble();

        //calls PaymentCalculator to calculate months
        int months = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment);

        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}
