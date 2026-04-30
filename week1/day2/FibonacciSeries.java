package org.testleaf.week1.day2;

public class FibonacciSeries {

    public static void main(String[] args) {
        // Number of terms to print in the Fibonacci series
        int n = 8;

        // Initialize the first two numbers of the series
        int a = 0, b = 1;

        // Loop to print Fibonacci series up to n terms
        for (int i = 0; i < n; i++) {

            // Print the current number in the series
            System.out.println(a + " ");

            // Calculate the next number by adding previous two numbers
            int c = a + b;

             // Update values for next iteration
            a = b;
            b = c;
        }
    }

}
