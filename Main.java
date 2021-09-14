/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.RoundingMode;

public class Main {

    private static DecimalFormat d = new DecimalFormat("#.##");

    public static void main(String[] args) {
        System.out.println("What is the principal amount? ");
        Scanner s1 = new Scanner(System.in);
        int pri = s1.nextInt();
        System.out.println("What is the rate? ");
        Scanner s2 = new Scanner(System.in);
        double rate_p = s2.nextDouble();
        System.out.println("What is the number of years? ");
        Scanner s3 = new Scanner(System.in);
        int years = s3.nextInt();
        System.out.println("What is the number of times the interest rate is compounded per year? ");
        Scanner s4 = new Scanner(System.in);
        int times_comp = s4.nextInt();

        double rate = rate_p/100;

        double inv = pri * Math.pow((1 + rate/times_comp), (times_comp*years));
        d.setRoundingMode(RoundingMode.UP);
        System.out.println("$" + pri + " invested at " + rate_p + "% for " + years + " years compounded " +
                times_comp + " times per year is $" + d.format(inv));
    }
}
