/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Chris Mathew
 */
package ex25;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    static String out;

    public static void main (String[] args) {
        System.out.println("Enter your password: ");
        String password = in.nextLine();

        out = switch (passwordValidator(password)){
            case 3 -> "' is a very strong password.";
            case 2 -> "' is a strong password.";
            case 1 -> "' is a weak password.";
            default -> "' is a very weak password.";
        };

        System.out.println("The password '" + password + out);
    }

    public static int passwordValidator(String pass) {
        int strength = 0;
        int i;
        boolean numbers = false, letters= false, length= false, symbol = false;
        //convert password into a char array
        char word[] = pass.toCharArray();
        //check if the password is more than 8 characters and has letters, numbers, and symbols
        for (i = 0; i < pass.length(); i++) {
            if (pass.length() >= 8)
                length = true;

            if (Character.isLetter(word[i]))
                letters = true;
            else if (Character.isDigit(word[i]))
                numbers = true;
            else
                symbol = true;
        }

        // check if password is very strong, strong, or weak. default to very weak
        if (symbol && numbers && letters && length)
            strength = 3;
        else if (!symbol && numbers && letters && length)
            strength = 2;
        else if (!symbol && !numbers && letters && !length)
            strength = 1;

        return strength;
    }

}
