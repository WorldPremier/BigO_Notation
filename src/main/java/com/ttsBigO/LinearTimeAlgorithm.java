package com.ttsBigO;

import java.math.BigInteger;

/**
 * Calculate the sum from 1 to N
 *
 */
public class LinearTimeAlgorithm {

    /**
     * O(n) - Calculate the sum from 1 to N via sum all the numbers
     */
    public BigInteger sumOfArithmeticSerie_via_add_all(long n) {
        BigInteger sum = BigInteger.valueOf(0);
        for (long i = 1; i <= n; i++) {
            sum = sum.add(BigInteger.valueOf(i));
        }
        return sum;
    }
}
