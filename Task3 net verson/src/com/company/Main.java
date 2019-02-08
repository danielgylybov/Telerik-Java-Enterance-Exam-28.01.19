package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String myString = in.nextLine();
        int largestSequence = 0;
        char longestChar = '\0';

            int currentSequence = 1;
            char current = '\0';
            char next = '\0';

            for (int i = 0; i < myString.length() - 1; i++) {
                current = myString.charAt(i);
                next = myString.charAt(i + 1);

                // If character's are in sequence , increase the counter
                if (current == next) {
                    currentSequence += 1;
                } else {
                    if (currentSequence > largestSequence) { // When sequence is
                        // completed, check if
                        // it is longest
                        largestSequence = currentSequence;
                        longestChar = current;
                    }
                    currentSequence = 1; // re-initialize counter
                }
            }
            if (currentSequence > largestSequence) { // Check if last string
                // sequence is longest
                largestSequence = currentSequence;
                longestChar = current;
            }
            for (int i = 0; i < largestSequence; i++)
                System.out.print(longestChar);
        }

    }
