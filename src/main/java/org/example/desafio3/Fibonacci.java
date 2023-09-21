package org.example.desafio3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long result = fibonacci(N);

        System.out.println("Fib = " + result);
    }

    public static long fibonacci(int n) {
        if (n < 0) {
            System.exit(0);
        }
        if (n <= 1) {
            return n;
        }
        long fib = 0;
        long beforePrevious = 0;
        long previous = 1;

        for (int i = 2; i <= n; i++) {
            fib = previous + beforePrevious;
            beforePrevious = previous;
            previous = fib;
        }

        return fib;
    }
}
