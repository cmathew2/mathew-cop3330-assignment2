/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Chris Mathew
 */
package ex29;

import java.util.Scanner;

import static java.lang.Math.ceil;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double r = rateOfReturn();
        int years = yearsTillDouble(r);

        System.out.println("It will take " + years + " years to double your initial investment.");
    }

    static public double rateOfReturn() {
        String rate;
        while (true) {
            System.out.print("What is the rate of return? ");
            rate = in.nextLine();
            try {
                if (rate.equals("0")) {
                    System.out.print("That is not a valid input.\n");
                } else {
                    Double.parseDouble(rate);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("That is not a valid input.\n");
            }
        }
        return Double.parseDouble(rate);
    }
    static int yearsTillDouble(double rateReturn){
        return (int) ceil(72.0/rateReturn);
    }
}
