package dsa_leetcode;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class NearestLargestLeftElem {
    static Queue<Integer> largestElemLeft(int[] arr){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i<arr.length ; i++){
            if(stack.size() == 0){
                queue.offer(-1);
            }
            else if(stack.size() > 0 && stack.peek() > arr[i]){
                queue.offer(stack.peek());
            }
            else if(stack.size() > 0 && stack.peek() <= arr[i]){
                while(stack.size() != 0 && stack.peek() <= arr[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    queue.offer(-1);
                }
                else{
                    queue.offer(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        return queue;
    }

    public static void main(String[] args) {
        int[] nums = {2, 8, 5, 4, 10};
        System.out.println(largestElemLeft(nums));
    }
}
