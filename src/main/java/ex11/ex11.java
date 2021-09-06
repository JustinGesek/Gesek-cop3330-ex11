package ex11;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;

//How many euros are you exchanging? 81
//What is the exchange rate? 1.3751
//81 euros at an exchange rate of 1.3751 is
//111.38 U.S. dollars.
public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double euros = scanner.nextDouble();

        System.out.print("What is the exchange rate? ");
        double rate = scanner.nextDouble();

        double dollars = euros * rate;
        double pennies = dollars * 100.0;

        System.out.printf("%f euros at an exchange rate of %.4f is\n%.2f U.S. dollars.\n", euros, rate, dollars);

    }
}
