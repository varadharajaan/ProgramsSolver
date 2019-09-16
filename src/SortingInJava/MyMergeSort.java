package SortingInJava;

import java.util.Arrays;

public class MyMergeSort {
    private int[] arrayVal;
    private int[] tempArray;

    private int number;
    
    public static void main(String[] args )
    {
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        MyMergeSort my = new MyMergeSort();
        my.sort(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }
    
    public void sort(int[] arrayVal) {
        this.arrayVal = arrayVal;
        this.number = arrayVal.length;
        this.tempArray = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            tempArray[i] = arrayVal[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                arrayVal[k] = tempArray[i];
                i++;
            } else {
                arrayVal[k] = tempArray[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            arrayVal[k] = tempArray[i];
            k++;
            i++;
        }
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.

    }
}