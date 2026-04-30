package org.testleaf.week1.day2;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 12; // input
        boolean isPrime = true;

        // Check if number is less than 2
        if (n < 2) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to n-1
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is Not a Prime Number");
        }
    }
}
