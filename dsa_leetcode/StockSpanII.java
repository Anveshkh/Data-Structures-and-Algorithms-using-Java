package dsa_leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StockSpanII {
    static Queue<Integer> stockSpan(int[] nums){
        Stack<int[]> stack = new Stack<>();
        Queue<Integer> ans = new PriorityQueue<>();

        for(int i = 0; i<nums.length; i++){
            if(stack.size() == 0){
                ans.offer(1);
            }
            else if(stack.peek()[0]> nums[i]){
                ans.offer(i - stack.peek()[1]);
            }
            else if(stack.peek()[0] <= nums[i]){
                while(stack.size() != 0 && stack.peek()[0] <= nums[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    ans.offer(1);
                }else{
                    ans.offer(i-stack.peek()[1]);
                }
            }
            int[] arr = {nums[i], i};
            stack.push(arr);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 65, 75, 85};
        System.out.println("hi");
        System.out.println(stockSpan(arr));
    }
}
