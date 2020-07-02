package com.rameswar.hackerRank.PS;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlmostSorted {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        List<Integer> differences = compareArrays(arr,sortedArr);
        Integer firstDifference = differences.get(0);
        Integer lastDifference = differences.get(differences.size()-1);
        if(differences.isEmpty()) {
            System.out.println("yes");
        }else if(differences.size() == 2) {
            System.out.println("yes");
            System.out.printf("%s %d %d", "swap",firstDifference+1,lastDifference+1);
        }else {
            reverse(arr,firstDifference,lastDifference);
            if(compareArrays(arr, sortedArr).isEmpty()) {
                System.out.println("yes");
                System.out.printf("%s %d %d", "reverse",firstDifference+1,lastDifference+1);
            }else {
                System.out.println("no");
            }
        }
        scanner.close();
    }

    private static void reverse(int[] arr, Integer firstDifference, Integer lastDifference) {
        for (int i = 0; i < ((lastDifference-firstDifference)/2)+1; i++) {
            int temp = arr[firstDifference+i];
            arr[firstDifference+i]=arr[lastDifference-i];
            arr[lastDifference-i] = temp;
        }
    }

    private static List<Integer> compareArrays(int[] arr, int[] sortedArr) {
        return IntStream.range(0, arr.length).filter(m -> arr[m] != sortedArr[m]).boxed().collect(Collectors.toList());
    }
}
