package com.company;

public class Runner {

    public static void main(String[] args) {
        int[] testArr = {8, 6, 7, 5, 3, 0, 9, 10, 1, 2, 3};
        double[] douArr = {1.2, 1.7, 2.5, 5.8, 0.5, 1.9, 1.3, 6.2, 7.1, 2.3, 1.8};
        String[] strArr = {"Cat", "Dog", "Lion", "Tiger", "Panda", "Computer", "Mouse", "Rabbit"};



        System.out.print("Before: ");
        for (String str : strArr)
            System.out.print(str + " ");
        System.out.println();
        System.out.println("This is Bubble Sort");
        InPlaceSorts.bubbleSort(strArr);
        System.out.print("After: ");
        for (String str : strArr) {
            System.out.print(str + " ");
            System.out.println();
        }


        System.out.println("This is Selection Sort");
        System.out.print("Before: ");
        for (double num : douArr)
            System.out.print(num + " ");
        System.out.println();
        InPlaceSorts.SelectionSort(douArr);
        System.out.print("After: ");
        for (double num : douArr) {
            System.out.print(num + " ");
            System.out.println();
        }


        System.out.println("This is Insertion Sort");
        for (int num : testArr)
            System.out.print(num + " ");
        System.out.println();
        InPlaceSorts.insertionSort(testArr);
        System.out.print("After: ");
        for (int num : testArr) {
            System.out.print(num + " ");
            System.out.println();
        }


    }
}
