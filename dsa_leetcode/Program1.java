package dsa_leetcode;



// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

public class Program1 {
    public void rotate(int[] nums, int k) {
        int[] sol = new int[nums.length];
        int j = 0;
        for(int i = nums.length -k; i<nums.length; i++){
            sol[j] = nums[i];
            j++;
        }

        for(int i = 0; i<nums.length - k ; i++){
            sol[j] = nums[i];
            j++;
        }

        for(int i = 0; i<nums.length ; i++){
            nums[i] = sol[i];
        }
    }
}
