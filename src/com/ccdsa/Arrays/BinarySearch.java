package com.ccdsa.Arrays;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            //comparisons
            if (numbers[mid] == key) //found
                return mid;
            else if (numbers[mid] > key) //left
                end = mid - 1;
            else //right
                start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 12;

        int index = binarySearch(numbers, key);
        if (index == -1)
            System.out.println("Not Found");
        else
            System.out.println("Key: " + key + " Found at index: " + index);
    }
}
