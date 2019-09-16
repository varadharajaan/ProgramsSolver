package SortingInJava;

import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args) {
        int[] arr = {45,43,11,89,77,98,4,28,65,23};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
 
    public static void quickSort(int[] arr, int start, int end){
 
        int pivotIndex = partition(arr, start, end);
 
        if(pivotIndex-1>start) {
            quickSort(arr, start, pivotIndex - 1);
        }
        if(pivotIndex+1<end) {
            quickSort(arr, pivotIndex + 1, end);
        }
    }
 
    public static int partition(int[] arr, int start, int end){
        int pivotValue = arr[end];
 
        for(int i=start; i<end; i++){
            if(arr[i]<pivotValue){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
        int temp = arr[start];
        arr[start] = pivotValue;
        arr[end] = temp;
 
        return start;
    }

}
