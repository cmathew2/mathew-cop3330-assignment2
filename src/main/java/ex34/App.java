/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Chris Mathew
 */
package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> employees = createArrayList();
        printEmployees(employees);
        System.out.println("\nEnter an employee name to remove: \n");
        String toRemove = in.nextLine();

    }
    static ArrayList<String> createArrayList(){
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        return employees;
    }
    static void printEmployees(ArrayList<String> employees){
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}
