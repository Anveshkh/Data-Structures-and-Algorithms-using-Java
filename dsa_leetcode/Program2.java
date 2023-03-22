package dsa_leetcode;

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order


public class Program2 {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i =0; i<ans.length ; i++){
            ans[i] = nums[i]*nums[i];
        }
        // Here we do have square of each number in ans array now sorting it
        return BubbleSort(ans);
    }

    public int[] BubbleSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
