package Sorting;

import static Sorting.QuickSort.Quick;

public class Partition {
    public static void Divide(int[] arr, int lb, int ub){

        if(lb<ub){
            int loc = Quick(arr, lb, ub);
            Divide(arr, lb, loc-1);
            Divide(arr, loc+1, ub);
        }
    }
}
