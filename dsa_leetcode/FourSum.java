package dsa_leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        fourSum(arr, target);

    }

    static void fourSum(int[] nums, int target){
        Set<ArrayList<Integer>> ans = new HashSet<>();
        int n = nums.length;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int left = j+1, right = n-1;
                int target2 = target - nums[i] - nums[j];

                while(left < right){
                    int two_sum = nums[left] + nums[right];
                    if(two_sum < target2) left++;
                    else if(two_sum > target2) right--;
                    else{
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);

                        ans.add(quad);

                        while(left < right && nums[left] == quad.get(2)) ++left;

                        while(left < right && nums[right] == quad.get(3)) --right;

                    }
                }

                while(j + 1 < n && nums[j+1] == nums[j]) ++j;

            }
            while(i+1 < n && nums[i+1] == nums[i]) ++i;
        }
        System.out.println(ans);
    }
}
