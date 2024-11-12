package com.hashing;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Taking the number of elements in the array
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();  // Reads the count of elements to be entered
        int[] arr = new int[n];  // Creates an array of size n

        // Step 2: Taking n elements as input   
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Fills the array with user input
        }

        // Step 3: Initializing a hash array to count occurrences
        int[] hash = new int[13];  // Creates a hash array to store counts (assuming values will be in the range 0-12)
        for(int i = 0; i < n; i++) {
            hash[arr[i]] += 1;  // Increases count at index equal to arr[i]
        }

        // Step 4: Taking the number of queries
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();  // Reads the count of queries

        // Step 5: Processing each query
        System.out.println("Enter the numbers to query:");
        while (q-- > 0) {  // Loops q times for each query
            int number = sc.nextInt();  // Reads the number to query
            // Outputting the frequency of the queried number
            System.out.println("Frequency of " + number + " is: " + hash[number]);
        }
    }
}
