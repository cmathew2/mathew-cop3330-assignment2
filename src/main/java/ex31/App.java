/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Chris Mathew
 */
package ex31;

import java.util.Scanner;

public class App {

    static String output;
    static double a, r;
    static String age, rate;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("What is your age? ");
            age = in.next();
            System.out.print("What is your resting heart rate (in bpm)? ");
            rate = in.next();

            try {
                a = Double.parseDouble(age);
                r = Double.parseDouble(rate);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid input. Only enter numbers for both prompts. Try again.\n");

            }
        }
        Karonven.output_table();
        System.out.println(output);
    }
}
