package com.ccdsa.Arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding the correct position for insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            //inserting
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,4,2,3,8,6,7};
        insertionSort(arr);
        System.out.println("sorted array is: " + Arrays.toString(arr));
    }
}
