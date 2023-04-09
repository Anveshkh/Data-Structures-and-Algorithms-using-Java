package dsa_leetcode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i], ++val);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        System.out.println(map);


    }
}
