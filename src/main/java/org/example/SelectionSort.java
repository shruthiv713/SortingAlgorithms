package org.example;

public class SelectionSort {
    public static void sort(int[] arr) {
        int i,j;
        int n = arr.length;
        for(i=0;i<n;i++) {
            int min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
