package dsa_leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};
        for(int i = 0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        // Now set contains all the unique elements of arr1 and arr2
        int i = 0;
        int[] ans = new int[set.size()];
        for(int it : set){
            ans[i++] = it;
        }

        System.out.println(Arrays.toString(ans));
    }
}
