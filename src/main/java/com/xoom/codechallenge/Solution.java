package com.xoom.codechallenge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the divisors function below.
     */
    static int divisors(int n) {
        /*
         * Write your code here.
         */
        int numDivisors = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i && i % 2 == 0) {
                    numDivisors++;
                } else {
                    if (i % 2 == 0) {
                        numDivisors++;
                    }
                    if (n/i % 2 == 0) {
                        numDivisors++;
                    }
                }
            }
        }
        return numDivisors;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = divisors(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
