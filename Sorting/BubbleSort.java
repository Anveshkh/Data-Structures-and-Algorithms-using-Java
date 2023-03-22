package Sorting;

import static Sorting.Swap.swap;

public class BubbleSort {
    public static void Bubble(int[] arr){
        int i,j;
        for(i = 0; i<arr.length-1; i++){
            for(j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    swap(arr, j, j+1);
                }
            }
        }
    }
}
