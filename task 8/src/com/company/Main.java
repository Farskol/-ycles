package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Write two numbers:");
        String firstNumber = console.nextLine();
        String secondNumber = console.nextLine();
        String all = firstNumber + secondNumber;
        int i;
        char numbers[] = new char[all.length()];
        numbers [0] = all.charAt(0);
        System.out.print(all+ ", ");
        System.out.print("Number which you wrote include: " + all.charAt(0)+", ");
        for ( i=1; i < all.length(); i++){
            numbers [i] = all.charAt(i);
                    int i3 = 0;
                    for (int i2=i; i2>0; i2--){
                    if (numbers[i] != numbers[i2-1] && numbers [i] != '.' && numbers[i] != ',') {
                        i3++;
                    }
                    if (i == i3){
                        System.out.print(numbers[i] + ", ");
                    }
                    }
            }
    }
}
