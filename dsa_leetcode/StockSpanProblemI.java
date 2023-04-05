package dsa_leetcode;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StockSpanProblemI {
    static Queue<Integer> stockSpan(int[] nums){
        System.out.println("jo");
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> index = new Stack<>();
        Queue<Integer> ans = new PriorityQueue<>();

        for(int i = 0; i<nums.length; i++){
            if(stack.size() == 0){
                ans.offer(1);
                index.push(i);
            }
            else if(stack.size() > 0 && stack.peek() > nums[i]){
                ans.offer(i - index.peek());
                index.push(i);
            }
            else if(stack.size() > 0 && stack.peek() <= nums[i]){
                while(stack.size() > 0 && stack.peek() <= nums[i]){
                    stack.pop();
                    index.pop();
                }
                if(stack.size() == 0){
                    ans.offer(i+1);
                }
                else{
                    ans.offer(i-index.peek());
                    index.push(i);
                }
            }
            stack.push(nums[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {100, 80, 60, 70, 65, 75, 85};
        System.out.println(stockSpan(nums));
    }
}
