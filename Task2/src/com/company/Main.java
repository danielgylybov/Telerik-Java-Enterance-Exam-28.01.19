package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        int target = in.nextInt();

        int inputArr[] = Arrays.stream(input.split("[^-\\d]+"))
                .filter(s -> !s.matches("-?"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 1; i < inputArr.length - 1; i++)
        {
            if (target == inputArr[i]) {
                if (inputArr[i] != inputArr[i-1] && inputArr[i] != inputArr[i+1]) {
                    inputArr[i] = Math.max(inputArr[i-1], inputArr[i+1]);
                }
            }
        }
        System.out.println(Arrays.toString(inputArr));
    }
}
