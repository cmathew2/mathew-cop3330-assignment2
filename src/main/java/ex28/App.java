/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Chris Mathew
 */
package ex28;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = inputNum();
            sum += numbers[i];
        }
        System.out.println("The total is: " + sum);

    }
    public static int loopSum(int[] num) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += num[i];
        }
        return sum;
    }
    public static int inputNum() {
        System.out.println("Enter a number: ");
        return in.nextInt();
    }
}



