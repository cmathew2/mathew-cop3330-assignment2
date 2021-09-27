/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Chris Mathew
 */
package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.println("Enter the first string: ");
        String string1 = in.next();
        System.out.println("Enter the second string: ");
        String string2 = in.next();

        if (isAnagram(string1, string2))
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are anagrams.") ;
        else
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are not anagrams.") ;
    }
    public static boolean isAnagram(String word1, String word2){
        //checks that both words are the same length
        if (word1.length() != word2.length())
            return false;
        //converts strings into arrays
        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();
        //sorts arrays to compare
        Arrays.sort(first);
        Arrays.sort(second);
        //checks if arrays are equal and if words are anagrams
        return Arrays.equals(first, second);
    }
}
