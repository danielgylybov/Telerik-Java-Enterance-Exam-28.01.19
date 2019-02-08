package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int devidables = 0;
        int finalsum = 0;

        int inputArr[] = Arrays.stream(input.replaceAll("-", " -").split("[^-\\d]+"))
                .filter(s -> !s.matches("-?"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] % 7 == 0 && inputArr[i] % 3 == 0) {
                devidables += inputArr[i];
            }
        }
        while (devidables > 0) {
            finalsum += devidables % 10;
            devidables /= 10;
        }
        System.out.println(finalsum);

    }
}
