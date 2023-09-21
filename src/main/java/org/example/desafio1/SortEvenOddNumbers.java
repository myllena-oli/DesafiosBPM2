package org.example.desafio1;

import java.util.*;

public class SortEvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();

            if (value % 2 == 0) {
                evens.add(value);
            } else {
                odds.add(value);
            }
        }
        displaySortedResults(evens, odds);
    }

    private static void displaySortedResults(ArrayList<Integer> evens, ArrayList<Integer> odds) {
        evens.sort(Comparator.naturalOrder());
        odds.sort(Comparator.reverseOrder());

        for (int even : evens) {
            System.out.println(even);
        }
        for (int odd : odds) {
            System.out.println(odd);
        }
    }
}
