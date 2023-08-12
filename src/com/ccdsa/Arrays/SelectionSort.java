package com.ccdsa.Arrays;

import java.util.Arrays;

public class SelectionSort {
    public static String selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minPos = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minPos])
                    minPos = j;
            }
            //actual swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1,7,8,6};
        System.out.println("sorted array is : " + selectionSort(arr));
    }
}
