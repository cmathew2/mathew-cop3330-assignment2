/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Chris Mathew
 */
package ex26;
// n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

/*
n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
 */

public class PaymentCalculator {

    public static int calculateMonthsUntilPaidOff(double b, double apr, double p) {
        double i = (apr/100)/365;
        //rounds fractions of a cent up to the next cent.
        return (int) Math.ceil(-(1.0/30.0) * Math.log10(1 + b/p * (1.0 - Math.pow(1.0 + i,30.0))) / Math.log10(1 + i));
    }
}
