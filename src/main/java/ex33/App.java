/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Chris Mathew
 */
package ex33;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("What's your question?");
        String question = in.nextLine();

        int random = rand.nextInt(4);
        String answer = magicBall(random);
        System.out.println(answer);
    }

    public static String magicBall(int random) {
        String[] answer = new String[4];

        answer[0] ="Yes";
        answer[1] = "No";
        answer[2] = "Maybe";
        answer[3] = "Ask again later";

        return answer[random];
        };
    }
