package SortingInJava;

class Rearrange {

    // The function to rearrange an array in-place so that arr[i] 

    // becomes arr[arr[i]]. 

    public static void main(String[] args) {

        Rearrange rearrange = new Rearrange();

        int arr[] = {3, 2, 0, 1};

        int n = arr.length;


        System.out.println("Given Array is :");

        rearrange.printArr(arr, n);


        rearrange.rearrange(arr, n);


        System.out.println("Modified Array is :");

        rearrange.printArr(arr, n);

    }


    // A utility function to print an array of size n 

    void rearrange(int arr[], int n) {

        // First step: Increase all values by (arr[arr[i]]%n)*n

        for (int i = 0; i < n; i++)

            arr[i] += (arr[arr[i]] % n) * n;


        // Second Step: Divide all values by n

        for (int i = 0; i < n; i++)

            arr[i] /= n;

    }



    /* Driver program to test above functions */

    void printArr(int arr[], int n) {

        for (int i = 0; i < n; i++)

            System.out.print(arr[i] + " ");

        System.out.println("");

    }
} 
