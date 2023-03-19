package Sorting;

public class Swap {
    public static void swap(int[] arr, int prev, int next){
        int temp = arr[prev];
        arr[prev] = arr[next];
        arr[next] = temp;
    }
}
