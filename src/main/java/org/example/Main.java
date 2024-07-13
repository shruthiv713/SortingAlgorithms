package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("---- Selection Sort ---- ");
        int[] arr = {5,3,9,0,2,1};
        System.out.println("Before");
        print(arr);
        SelectionSort.sort(arr);
        System.out.println("After");
        print(arr);

        System.out.println("---- Insertion Sort ---- ");
        int[] arr2 = {55,3,49,0,-2,1};
        System.out.println("Before");
        print(arr2);
        InsertionSort.sort(arr2);
        System.out.println("After");
        print(arr2);

        System.out.println("---- Merge Sort ---- ");
        int[] arr3 = {1,4,6,7,9,-5};
        System.out.println("Before");
        print(arr3);
        MergeSort.sort(arr3);
        System.out.println("After");
        print(arr3);

        System.out.println("---- Quick Sort ---- ");
        int[] arr4 = {1,4,6,7,9,-5};
        System.out.println("Before");
        print(arr4);
        QuickSort.sort(arr4);
        System.out.println("After");
        print(arr4);

    }

    private static void print(int[] arr) {
        for(int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println();
    }
}