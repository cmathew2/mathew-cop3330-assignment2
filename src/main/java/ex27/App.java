/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Chris Mathew
 */
package ex27;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);
    static String output = "";

    static String firstName;
    static String lastName;
    static String inputID;
    static String inputZIP;


    public static void main(String[] args) {
        System.out.println("Enter the first name: ");
        firstName = in.nextLine();
        System.out.println("Enter the last name: ");
        lastName = in.nextLine();
        System.out.println("Enter the ZIP code: ");
        inputZIP = in.nextLine();
        System.out.println("Enter the employee ID: ");
        inputID = in.nextLine();


        validateInput();


        System.out.println(output);
    }

    public static void validateInput() {
        checkFirstName(firstName);
        checkLastName(lastName);
        checkID(inputID);
        checkZIP(inputZIP);


    }

    public static String checkFirstName(String firstName) {
        if (firstName.isEmpty())
            output += "The first name must be filled in. \n";
        if (firstName.length() < 2) {
            output = output + "The first name must be at least 2 characters long. \n";
        }
        return output;
    }

    public static String checkLastName(String lastName) {
        if (lastName.isEmpty())
            output += "The last name must be filled in. \n";
        if (lastName.length() < 2) {
            output = output + "The last name must be at least 2 characters long. \n";
        }
        return output;
    }

    public static String checkZIP(String inputZIP) {
        if (inputZIP.length() == 5) {
            try {
                Integer.parseInt(inputZIP);
            } catch (NumberFormatException e) {
                output = output + "The zipcode must be a number.\n";
            }
        } else {
            output = output + "The zipcode must be a 5 digit number.\n";
        }
        return output;
    }

    public static String checkID(String inputID) {
        char[] ch = inputID.toCharArray();
        if (inputID.length() != 7)
            return output + "The employee ID must be in the format of AA-1234.\n";
        for (int i = 0; i <= 1; i++) {
            if (!Character.isLetter(ch[i])) {
                return output + ("The employee ID must be in the format of AA-1234.\n");
            }
        }
        if (ch[2] != '-') {
            return output + ("The employee ID must be in the format of AA-1234.\n");
        }
        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(ch[i])) {
                return output + ("The employee ID must be in the format of AA-1234.\n");
            }
        }
        if (output.equals("")){
            output = "There were no errors found.";
        }
        return output;
}

}
