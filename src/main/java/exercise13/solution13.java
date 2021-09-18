/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * Making a program that will calculate complex interest overtime with rate included over the years and the amount
 * of times that is compounded per year. The formula used is A = P(1 + r/n)^(n*t).
 */


package exercise13;
import java.util.*;
import java.lang.Math;

public class solution13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); //creates object for user input


        System.out.print("What is the principal amount? "); //base amount
        int amount = userInput.nextInt();

        System.out.print("What is the rate? "); //yearly rate of interest
        double rate = userInput.nextDouble();


        System.out.print("What is the number of years? ");
        int years = userInput.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = userInput.nextInt(); //the amount of interest compounded per year


        double A = amount * Math.pow(1 + ((rate * 0.01) / n), n * years); //A = P(1 + r/n)^(n*t)

        // Print the user entered data and calculated data
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.",
            amount, rate, years, n, A);
    }
}
