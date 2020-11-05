package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("write [a,b] and after h");
        System.out.println("a is:");
        double a = console.nextDouble();
        System.out.println("b is:");
        double b = console.nextDouble();
        System.out.println("h is:");
        double h = console.nextDouble();
         double i = a;
         while (i <= b) {
             if (i <= 2) {
                 System.out.println("we have this -> " + (-i));
             }
             else {
                 System.out.println("we have this -> " + i);
             }
             i +=h;
         }
    }
}
