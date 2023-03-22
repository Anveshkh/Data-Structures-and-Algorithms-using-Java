package dsa_leetcode;


// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.
// Running Sum of 1d

public class Program3 {
    public int[] runningSum(int[] nums) {
        int i,j;
        int[] ans = new int[nums.length];
        for(i =0; i<nums.length ; i++){
            int sum = 0;
            for(j = 0; j<=i; j++){
                sum+= nums[j];
            }
            ans[i] = sum;
        }

        for(i = 0; i<nums.length; i++){
            nums[i] = ans[i];
        }
        return nums;
    }

}
