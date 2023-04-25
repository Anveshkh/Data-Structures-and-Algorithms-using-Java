package dsa_leetcode;

import java.util.Arrays;

public class OneTwoZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,2,1,2,0,0,0};
        int low = 0;
        // We know that the numbers between mid and high contains unsorted part

        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
//                swap(arr, arr[mid], arr[low]);
                // Swapped
                low++;
                mid++;

            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
//                swap(arr, arr[mid], arr[high]);
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return;
    }
}
