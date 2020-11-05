package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner console = new Scanner(System.in);
        System.out.println("write some thing, m and after n:");
        int m = console.nextInt();
        int n = console.nextInt();
        for (int i = m; i <= n; i++){
                System.out.print("for "+i+" is: ");
                for (int i2 = 1; i2 <= i; i2++){
                    if (i%i2 == 0 && i2 != i && i2 != 1){
                        System.out.print(i2 + ", ");
                    }
                }
                System.out.println("");
        }
    }
}
