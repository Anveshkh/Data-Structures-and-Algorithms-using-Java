package Sorting;


import static Sorting.Swap.swap;

public class QuickSort {
    public static int Quick(int[] arr, int lb, int ub){
        int pivot = arr[lb];

        int p = lb, q = ub;
        while(p<q){
            while(arr[p] <= pivot){

                p++;
            }
            while(arr[q] > pivot){
                q--;
            }
            if(p<q){
                swap(arr, p, q);
            }
        }
        swap(arr, lb, q);
        return q;
    }
}
