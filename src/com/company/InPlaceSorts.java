package com.company;

public class InPlaceSorts {
    public static int[] bubbleSort(int[] Arr){
        for(int count = 0; count < Arr.length; count++) {
            for (int n = 0; n < Arr.length - 1; n++) {
                if (Arr[n] > Arr[n + 1]) {
                   swap(Arr, n, n + 1);
                }
            }
        }
        return Arr;
    }

    public static void swap(int[] testArr, int x, int y) {
        int temp;
        temp = testArr[x];
        testArr[x] = testArr[y];
        testArr[y] = temp;
    }

    public static int[] SelectionSort(int[] Arr)
    {
       for( int count = 0; count < Arr.length; count ++)
       {
           minimum(Arr, count);
       }
       return Arr;
    }

   public static void insertionSort(int[] Arr)
   {
       for(int i = 0; i < Arr.length; i++)
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



    public static int minimum(int [] Arr, int ind)
    {
        int minlnd = ind;
        for(int i = ind; i < Arr.length; i++)
        {
            if( Arr[i] < Arr[minlnd])
            {
                swap( Arr, i, minlnd);
                minlnd = i;
            }
        }
        return minlnd;
    }


}
