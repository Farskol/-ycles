package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger sum = new BigInteger("1");
        System.out.println("result is:");
        for (int i = 1; i <= 200; i++){
            int v = i*i;
            String v2 = Integer.toString(v);
            BigInteger sum1 = new BigInteger(v2);
            sum = sum.multiply(sum1);
        }
        System.out.println(sum);
    }
}
