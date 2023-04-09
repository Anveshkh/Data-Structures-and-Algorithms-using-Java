package dsa_leetcode;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        // find the single number
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                map.put(arr[i], ++val);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);
        System.out.println(map.containsValue(1));

    }
}
