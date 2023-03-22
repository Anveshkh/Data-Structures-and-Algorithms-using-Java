package Sorting;

import static Sorting.InsertionSort.Insertion;
import static Sorting.Partition.Divide;
import static Sorting.SelectionSort.SSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 1, 45, 3, 2, 67};
//        Bubble(arr);
//        SSort(arr);
//        Insertion(arr);
        System.out.println("Sorting elements using Quick Sort Technique");
        Divide(arr, 0, arr.length-1);
        int i;
        for(i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


}
