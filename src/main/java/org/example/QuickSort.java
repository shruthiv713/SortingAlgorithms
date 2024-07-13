package org.example;

import java.util.Random;

public class QuickSort {

    public static void sort(int[] arr) {
       shuffle(arr);

        sort(arr,0,arr.length-1);

    }

    private static void shuffle(int[] arr) {
        int j;
        int n =arr.length;
        Random r = new Random();
        for(j=n-1;j>=0;j--) {
            int ind = r.nextInt(j+1);
            swap(arr,j,ind);
        }
    }

    private static void sort(int[] arr, int st, int end) {
        if(st>=end) {
            return;
        }
        int j = partition(arr,st,end);
        sort(arr,st,j-1);
        sort(arr,j+1,end);
    }

    private static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo];
        int i = lo, j=hi+1;
        while(true) {
            while(i<hi&& arr[++i] <= pivot) {
                    if(i==hi) {break;}
            }
            while(j>lo&& arr[--j] >= pivot) {
                    if(j==lo) {break;}
            }
            if(i>=j) break;
            swap(arr,i,j);

        }
        swap(arr,lo,j);
        return j;


    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
