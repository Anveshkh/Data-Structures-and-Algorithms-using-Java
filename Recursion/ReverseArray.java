package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr, 0);
    }

    static void reverse(int[] arr, int i){
        if(i == arr.length/2){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-i-1] = temp;
        reverse(arr, i+1);
    }
}
