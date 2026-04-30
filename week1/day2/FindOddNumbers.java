package org.testleaf.week1.day2;

public class FindOddNumbers {

    public static void main(String[] args) {
        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Check if the number is odd
            // Odd numbers leave remainder 1 when divided by 2
            if (i % 2 == 1) {

                // Print the odd number
                System.out.println(i);
            }
        }
    }
}
