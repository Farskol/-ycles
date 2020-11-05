package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("So in this task we have some number 'e' and can you write its:");
        Scanner console = new Scanner(System.in);
        double e = console.nextDouble();
        double a = (1/2.0+1/3.0);
        System.out.println(a);
        double d = 1;
        if (e <= a) {
            for (double i = 1; d != 0; i++) {
                d = 1 / Math.pow(3, i) + 1 / Math.pow(2, i);
                a += d;
            }
            System.out.println(a);
        }
        else {
            System.out.println("it is impossible");
        }

    }
}
