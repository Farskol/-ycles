package com.company;

public class Main {

    public static void main(String[] args) {
        int sum =0;
        System.out.println("if first number 1, we have this: ");
	for (int i = 0; i <= 100; i++) {
	    sum += Math.pow(i,2);
    }
	System.out.println(sum);
	sum = 0;
	System.out.println("if first number 0, we have this: ");
        for (int i = 0; i <= 99; i++) {
            sum += Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
