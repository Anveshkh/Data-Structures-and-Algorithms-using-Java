package Recursion;

import java.util.ArrayList;

public class OnlyOneSubsequence {

    static int[] arr = {1, 2, 1};

    public static void main(String[] args) {
        int sum = 2;
        ArrayList<Integer> list = new ArrayList<>();
        boolean ans = func(0, list, sum, 0, arr.length);
    }

    static boolean func(int index, ArrayList list, int sum, int currsum, int length){
        if(index == length){
            System.out.println("hi");
            if(currsum == sum){
                System.out.println(list);
                return true;
            }
            return false;
        }
        // We can either select the current element or not select
        // Selecting
        list.add(arr[index]);
        currsum += arr[index];
        boolean ans = func(index + 1, list, sum, currsum, length);
        if(ans) return true;
        // Not selecting
        list.remove(arr[index]);
        currsum -= arr[index];
        boolean ans2 = func(index+1, list, sum, currsum, length);
        return ans2;
    }
}
