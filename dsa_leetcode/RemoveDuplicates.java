package dsa_leetcode;

// Remove duplicates from sorted array

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr= {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        extraSpace(arr, arr.length);
        constantSpace(arr, arr.length);
    }
    static int[] extraSpace(int[] arr, int n){
        int[] temp = new int[arr.length];
        int j = 0;

        for(int i = 0; i<arr.length -1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        return temp;
    }

    static int[] constantSpace(int[] arr, int n){
        int j = 0;
        for(int i = 0; i<n-1; i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return arr;
    }


}
