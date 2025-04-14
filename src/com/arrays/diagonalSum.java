package com.arrays;

import java.util.*;

class diagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking size of square matrix as input
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];             // Primary Diagonal
            secondarySum += arr[i][n - i - 1];   // Secondary Diagonal
        }

        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }
}
