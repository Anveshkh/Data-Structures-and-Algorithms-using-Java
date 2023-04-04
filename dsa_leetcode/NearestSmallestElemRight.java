package dsa_leetcode;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class NearestSmallestElemRight {
    static Queue<Integer> nearestSmallestElement(int[] nums){

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new PriorityQueue<>();

        for(int i = nums.length-1; i>= 0; i--){
            if(stack.size() == 0){
                queue.offer(-1);
            }
            else if(stack.size() > 0 && stack.peek() < nums[i]){
                queue.offer(stack.peek());
            }
            else if(stack.size() > 0 && stack.peek() >= nums[i]){
                while(stack.size() != 0 && stack.peek() >= nums[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    queue.offer(-1);
                }else{
                    queue.offer(stack.peek());
                }
            }
            stack.push(nums[i]);
        }
        return queue;
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 8, 3, 6};
        System.out.println(nearestSmallestElement(nums));
    }
}
