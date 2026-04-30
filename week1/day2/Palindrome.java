package org.testleaf.week1.day2;

public class Palindrome {
    public static void main(String[] args) {
        // Given number to check whether it is palindrome or not
        int input = 12145;

        // Variable to store reversed number
        int output = 0;

         // Loop to reverse the given number
        for (int i = input; i > 0; i = i / 10) {
            
            // Get the last digit of the number
            int rem = i % 10;

            // Build the reversed number
            output = output * 10 + rem;
        }

        // Compare original number with reversed number
        if (input == output) {

             // If both are same, it is palindrome
            System.out.println(output + " It is a Palindrome");
        } else {

             // If both are different, it is not palindrome
            System.out.println(output + " It is not a Palindrome");
        }
    }
}