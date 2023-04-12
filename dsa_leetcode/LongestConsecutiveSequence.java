package dsa_leetcode;

// Brute force

import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(j == n-1){
                    count = count +1;
                    list.add(count);
                    break;
                }
                if(arr[j+1] == (arr[j] + 1)){
                    count = count + 1;
                }
                else{
                    count = count + 1;
                    list.add(count);
                    i = count;
                    break;
                }
            }
            
        }
        System.out.println(list);
    }
}
