package com.company;

public class InPlaceSorts {

    //Sorting Algorithms

    public static String[] bubbleSort(String[] Arr){
        for(int count = 0; count < Arr.length; count++) {
            for (int n = 0; n < Arr.length - 1; n++) {
                if (Arr[n].compareTo(Arr[n + 1]) > 1) {
                   swap(Arr, n, n + 1);
                }
            }
        }
        return Arr;
    }

    public static void SelectionSort(double[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            swap( Arr,i, minIndex(Arr,i));
        }
    }

    public static void insertionSort(int[] Arr)
    {
        for(int i = 1; i < Arr.length; i++)
        {
            for( int j = i; j > 0; j--)
            {
                if(Arr[j-1] > Arr[j])
                {
                    swap(Arr, j-1, j);

                }
                else
                {
                    j = 0;
                }
            }
        }
    }

    // Sorting Utilities

    public static void swap(double[] testArr, int x, int y) {
        double temp;
        temp = testArr[x];
        testArr[x] = testArr[y];
        testArr[y] = temp;
    }

    public static void swap(int[] testArr, int x, int y) {
        int temp;
        temp = testArr[x];
        testArr[x] = testArr[y];
        testArr[y] = temp;
    }

    public static void swap(String[] testArr, int x, int y) {
        String temp;
        temp = testArr[x];
        testArr[x] = testArr[y];
        testArr[y] = temp;
    }

    public static int minimum(double [] Arr, int ind)
    {
        int minlnd = ind;
        for(int i = ind; i < Arr.length; i++)
        {
            if( Arr[i] < Arr[minlnd])
            {
                swap ( Arr, i, minlnd);
                minlnd = i;
            }
        }
        return minlnd;
    }

    public static double[] randomDoubArr(int count){
        double [] arr = new double[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (Math.random()*1000);
        }
        return arr;
    }

    public static int[] randomIntArr(int count){
        int [] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static String[] randomStrArr(int count, int length)
    {
        String[] arr = new String [count];
        while(count>0)
        {
            int i = 0;
            String s = "";
            while(i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            count--;
            arr[count] = s;
        }
        return arr;
    }
    public static int minIndex(double arr[],int ind){
        int index = ind;
        for(int i = index+1;i<arr.length;i++){
            if(arr[i]<arr[index]){
                index=i;
            }
        }
        return index;
    }

    public static boolean isSorted(String[] testArr) {
        for (int x = 0; x < testArr.length - 1; x++) {
            if (testArr[x].compareTo(testArr[x + 1])>1) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSorted(double[] testArr) {
        for (int x = 0; x < testArr.length - 1; x++) {
            if (testArr[x] > testArr[x + 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSorted(int[] testArr) {
        for (int x = 0; x < testArr.length - 1; x++) {
            if (testArr[x] > testArr[x + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(double[] before, double[] after) {
        double sumbefore = 0;
        double sumafter = 0;
        for (int x = 0; x < before.length; x++) {
            sumbefore = sumbefore + before[x];
        }
        for (int y = 0; y <after.length; y++) {
            sumafter = sumafter + after[y];
        }
        return sumafter == sumbefore;
    }
    public static boolean checkSum(int[] before, int[] after) {
        int sumbefore = 0;
        int sumafter = 0;
        for (int x = 0; x < before.length; x++) {
            sumbefore = sumbefore + before[x];
        }
        for (int y = 0; y <after.length; y++) {
            sumafter = sumafter + after[y];
        }
        return sumafter == sumbefore;
    }

}
