package org.example;

public class InsertionSort {




    public static void sort(int[] arr) {
        int i,j;
        int n =arr.length;
        for(i=1;i<n;i++) {
            for(j=i;j>0;j--) {
                if(arr[j-1]>arr[j]) {
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }

    }


    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
