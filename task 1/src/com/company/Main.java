package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("write positive and integer number:");
        int IntegerNumber = console.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= IntegerNumber) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
