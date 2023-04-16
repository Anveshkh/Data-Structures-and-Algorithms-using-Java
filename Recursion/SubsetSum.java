package Recursion;

import java.util.Arrays;

public class SubsetSum {
    static int n = 8;
    static int count = 0;
    static int[] arr = new int[n];

    public static void main(String[] args) {
        int[] nums = {3,1,2};
        func(nums, 0, 0);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void func(int[] nums, int index, int sum){
        if(index == nums.length){
            arr[count++] = sum;
            return;
        }
        // Selecting index element
        sum += nums[index];
        func(nums, index+1, sum);
        // Not selecting current element;
        sum -= nums[index];
        func(nums, index+1, sum);
    }

}
