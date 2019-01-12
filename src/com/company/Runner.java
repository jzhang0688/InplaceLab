package com.company;

public class Runner {

    public static void main(String[] args) {
        int[] testArr = InPlaceSorts.randomIntArr(10);
        double[] douArr = InPlaceSorts.randomDoubArr(10);
        String[] strArr = InPlaceSorts.randomStrArr(10,3);

        //BubbleSort
        System.out.println("This is Bubble Sort");
        System.out.print("Before: ");
        for (String str : strArr)
            System.out.print(str + " ");
        System.out.println();
        long time = System.nanoTime();
        InPlaceSorts.bubbleSort(strArr);
        System.out.print("After: ");
        for (String str : strArr) {
            System.out.print(str + " ");
        }
        System.out.println();
        time = System.nanoTime()-time;
        System.out.println("Time Taken: "+time);
        System.out.println("Is Sorted? " + InPlaceSorts.isSorted(strArr));


        //Selection Sort
        System.out.println();
        System.out.println();
        System.out.println("This is Selection Sort");
        System.out.print("Before: ");
        for (double num : douArr)
            System.out.print(num + " ");
        System.out.println();
        double[] before = douArr;
        long time1 = System.nanoTime();
        InPlaceSorts.SelectionSort(douArr);
        System.out.print("After: ");
        for (double num : douArr) {
            System.out.print(num + " ");
        }
        double[] after = douArr;
        System.out.println();
        time1 = System.nanoTime()-time1;
        System.out.println("Time Taken: "+time1);
        System.out.println("Is Sorted? " + InPlaceSorts.isSorted(douArr));
        System.out.println("Check Sum? " + InPlaceSorts.checkSum(before,after));



        //InsertionSort
        System.out.println();
        System.out.println();
        System.out.println("This is Insertion Sort");
        System.out.print("Before: ");
        for (int num : testArr)
            System.out.print(num + " ");
        System.out.println();
        int[] before1 = testArr;
        long time2 = System.nanoTime();
        InPlaceSorts.insertionSort(testArr);
        System.out.print("After: ");
        for (int num : testArr) {
            System.out.print(num + " ");
        }
        int[] after1 = testArr;
        System.out.println();
        time2 = System.nanoTime()-time2;
        System.out.println("Time Taken: "+time2);
        System.out.println("Is Sorted? " + InPlaceSorts.isSorted(testArr));
        System.out.println("Check Sum? " + InPlaceSorts.checkSum(before1,after1));




    }
}
