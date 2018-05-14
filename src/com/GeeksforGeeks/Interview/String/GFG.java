package com.GeeksforGeeks.Interview.String;

//Java program to print all n-digit numbers 
//with absolute difference between sum 
//of even and odd digits is 1

import java.io.*;
import java.util.*;

class GFG 
{
 // Recursive function to print all N-digit numbers 
 // with absolute difference between sum of even 
 // and odd digits is 1. This function considers 
 // leading zero as a digit

 // n --> value of input
 // out --> output array
 // index --> index of next digit to be filled in output array
 // evenSum, oddSum --> sum of even and odd digits so far
 static void findNDigitNumsUtil(int n, char out[], int index,int evenSum, int oddSum)
 {
     // Base case
     if (index > n)
         return;

     // If number becomes n-digit
     if (index == n)
     {
         // if absolute difference between sum of even and
         // odd digits is 1, print the number
         if (Math.abs(evenSum - oddSum) == 1)
         {
        	 out[index] = ' ';
             System.out.print(out);
             System.out.print(" ");
         }
         return;
     }

     // If current index is odd, then add it to odd sum and recurse
     if (index % 2 != 0)
     {
         for (int i = 0; i <= 9; i++)
         {
             out[index] = (char)(i + '0');
             findNDigitNumsUtil(n, out, index + 1, evenSum, oddSum + i);
         }
     }
     else // else add to even sum and recurse
     {
         for (int i = 0; i <= 9; i++)
         {
             out[index] = (char)(i + '0');
             findNDigitNumsUtil(n, out, index + 1, evenSum + i, oddSum);
         }
     }
 }
  
 // This is mainly a wrapper over findNDigitNumsUtil.
 // It explicitly handles leading digit and calls
 // findNDigitNumsUtil() for remaining indexes
 static void findNDigitNums(int n)
 {
     // output array to store n-digit numbers
     char[] out = new char[n + 1];

     // Initialize number index considered so far
     int index = 0;

     // Initialize even and odd sums
     int evenSum = 0, oddSum = 0;

     // Explicitly handle first digit and call recursive function
     // findNDigitNumsUtil for remaining indexes. Note that the
     // first digit is considered to be present in even position
     for (int i = 1; i <= 9; i++)
     {
         out[index] = (char)(i + '0');
         findNDigitNumsUtil(n, out, index + 1, evenSum + i, oddSum);
     }
 }
  
 // Driver program
 public static void main (String[] args) 
 {
     int n = 3;
     findNDigitNums(n);
 }
}

//This code is contributed by Pramod Kumar
