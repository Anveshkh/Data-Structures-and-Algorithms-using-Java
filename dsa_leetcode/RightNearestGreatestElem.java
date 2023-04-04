package dsa_leetcode;


import java.util.ArrayList;
import java.util.Stack;

public class RightNearestGreatestElem {
    static Stack<Integer> NearestRightGreatest(int[] nums){

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> ans = new Stack<>();

        for(int i = nums.length-1; i>=0; i--){
            if(stack.size() == 0){
                ans.push(-1);
            }
            else if(stack.size() > 0 && stack.peek() > nums[i]){
                ans.push(stack.peek());
            }
            else if(stack.size() > 0 && stack.peek() <= nums[i]){
                while(stack.size() != 0 && stack.peek() <= nums[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    ans.push(-1);
                }
                else{
                    ans.push(stack.peek());
                }
            }
            stack.push(nums[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 8, 5, 4, 10};
        Stack<Integer> ans = NearestRightGreatest(nums);
        System.out.println(ans);
        ArrayList<Integer> list = new ArrayList<>();
        int size = ans.size();
        for(int i = 0; i<size; i++){
            list.add(ans.pop());
        }
        System.out.println(list);
    }
}
