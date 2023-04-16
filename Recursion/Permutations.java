package Recursion;

// Given an array nums of distinct integers return all the possible permutations you can return. You can return ans in any order

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];

        permutation(nums, nums.length, ds, freq, ans);
        System.out.println(ans);
    }

    static void permutation(int[] nums, int len,  List<Integer> ds, boolean[] freq, List<List<Integer>> ans){
        if(ds.size() == len){
            ans.add(new ArrayList<>(ds));
            return;
        }
//        for(int i =0; i<nums.length; i++){
//            if(!freq[i]){
//                freq[i] = true;
//                ds.add(nums[i]);
//                permutation(nums, len, ds, freq, ans);
//                freq[i] = false;
//                ds.remove(nums[i]);
//                if(i == nums.length-1) return;
//            }
//
//        }
        int i = 0;
        while(i < len){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                permutation(nums, len, ds, freq, ans);
                freq[i] = false;
                ds.remove(ds.size() - 1);
            }
            i++;
        }

    }
}
