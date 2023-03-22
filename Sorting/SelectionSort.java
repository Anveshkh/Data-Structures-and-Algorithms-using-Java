package Sorting;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import static Sorting.Swap.swap;

public class SelectionSort {
    public static void SSort(int[] arr){

        int i,j;
        System.out.println("Sorting elements using Selection Sort technique");
        for(i = 0; i<arr.length-1; i++){
            for(j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i,j);
                }
            }
        }
    }
}
