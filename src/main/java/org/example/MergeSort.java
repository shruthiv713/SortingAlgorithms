package org.example;

public class MergeSort {
    public static void sort(int[] arr) {
        sort(arr,0,arr.length-1);
    }

    private static void sort(int[] arr, int st, int end) {
        if(st>=end) {
            return;
        }
        int mid = st+(end-st)/2;
        sort(arr,st,mid);
        sort(arr,mid+1,end);
        merge(arr,st,mid,end);
    }

    private static void merge(int[] arr, int st, int mid, int end) {
        int[] dup = new int[arr.length];
        int i=st,j=mid+1; int k,m;
        for(k=0;k< arr.length;k++) {
            dup[k] = arr[k];
        }
        for(m=st;m<=end;m++) {
            if(i>mid) {
                arr[m] = dup[j++];
            } else if(j>end) {
                arr[m] = dup[i++];
            }
            else if(dup[i]<=dup[j]) {
                arr[m] = dup[i++];
            } else {
                arr[m] = dup[j++];
            }
        }

    }
}
