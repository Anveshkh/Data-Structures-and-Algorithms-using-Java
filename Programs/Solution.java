package Programs;

import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i, j, k, key;
        if(nums1.length == 0){
        }
        Queue<Integer> queue = new LinkedList<>();
        for(i = 0; i<nums1.length; i++){
            j = 0;
            key = nums1[i];

            while(nums2[j] != key){
                j++;
            }
            if(j == nums2.length-1){
                queue.offer(-1);
                break;
            }else{
                for(k = j+1; k< nums2.length; k++){
                    if(nums2[k] > key){
                        queue.offer(nums2[k]);
                        break;
                    }
                    if(k == nums2.length-1){
                        queue.offer(-1);
                    }
                }
            }

        }
        int[] arr = new int[queue.size()];
        for(i = 0; i<nums1.length; i++){
            arr[i] = queue.poll();
        }
        return arr;

    }
}