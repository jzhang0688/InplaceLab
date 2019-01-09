package com.company;

public class Runner {

    public static void main(String[] args) {
        int[] testArr = {8, 6, 7, 5, 3, 0, 9, 10, 1, 2, 3};
        System.out.print("Before: ");
        for (int num : testArr)
            System.out.print(num + " ");
        System.out.println();
        int[] before = testArr;

        InPlaceSorts.bubbleSort(testArr);
        System.out.print("After: ");
        for (int num : testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        InPlaceSorts.SelectionSort(before);
        for (int num : testArr) {
            System.out.print(num + "s ");
            System.out.println();
        }
        int[] after = testArr;

    }
}