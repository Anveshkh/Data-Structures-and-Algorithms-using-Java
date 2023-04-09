package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {11, 3, 7, 9, 14, 9};
        int target = 17;
        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(target - arr[i])){
                ans[0] = map.get(target - arr[i]);
                ans[1] = i;
                break;
            }
            map.put(arr[i], i);
        }

        System.out.println(Arrays.toString(ans));
    }
}
