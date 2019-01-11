package com.company;

public class Runner {

    public static void main(String[] args) {
        int[] testArr = {8, 6, 7, 5, 3, 0, 9, 10, 1, 2, 3};
        System.out.print("Before: ");
        for (int num : testArr)
            System.out.print(num + " ");
        System.out.println();
        int[] before = testArr;
        System.out.println("This is Bubble Sort");
        InPlaceSorts.bubbleSort(testArr);
        System.out.print("After: ");
        for (int num : testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        System.out.println("This is Selection Sort");
        InPlaceSorts.SelectionSort(before);
        for (int num : testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        System.out.println("This is Insertion Sort");
        InPlaceSorts.insertionSort(before);
        for (int num : before) {
            System.out.print(num + " ");
            System.out.println();
        }

    }
}
