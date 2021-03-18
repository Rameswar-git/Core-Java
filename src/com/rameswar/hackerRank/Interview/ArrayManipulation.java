package com.rameswar.hackerRank.Interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
        int n = scan.nextInt();
        int m = scan.nextInt();
        long[] arr = new long[n+2];
        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int val = scan.nextInt();
            arr[a]+=val;
            arr[b+1]-=val;
        }
        long result=0 , curr=0;
        for (int i = 0; i < arr.length; i++) {
            curr+=arr[i];
            result=Math.max(result, curr);
        }
        System.out.println(result);
        scan.close();
    }

}
