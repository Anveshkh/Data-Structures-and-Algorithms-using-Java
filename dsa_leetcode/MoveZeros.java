package dsa_leetcode;

import OOP.AccessControl.A;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        int i, j, n = arr.length;
        for(i = 0; i<n; i++){
            if(arr[i] == 0){
                j = i;
                while(arr[j] == 0){
                    if(j == arr.length-1) break;
                    j++;
                }
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;


            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
