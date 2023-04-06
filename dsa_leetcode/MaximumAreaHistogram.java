package dsa_leetcode;

import java.util.Arrays;
import java.util.Stack;

public class MaximumAreaHistogram {
    static int[] MaxAreaHist(int[] arr){

        int[] ANS = NearestSR(arr); // 7, 7, 5, 5, 3, 5, 1
        int[] NSR = new int[arr.length];
        int[] NSL = NearestSL(arr);

        int[] width = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            NSR[i] = ANS[arr.length-1-i];
            width[i] = NSR[i] - NSL[i] - 1;
        }

        System.out.println("NSR IS : - " + Arrays.toString(NSR));
        System.out.println("NSL IS : - " + Arrays.toString(NSL));
        System.out.println("Width is : - " + Arrays.toString(width));
        return width;
    }

    static int[] NearestSL(int[] arr){
        int pseudoIndex = -1;
        Stack<int[]> stack = new Stack<>();
        int[] NSL = new int[arr.length];
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(stack.size() == 0){
                NSL[count++] = pseudoIndex;
            }
            else if(stack.size() > 0 && stack.peek()[0] < arr[i]){
                NSL[count++] = stack.peek()[1];
            }
            else if(stack.size() > 0 && stack.peek()[0] >= arr[i]){
                while(stack.size() > 0 && stack.peek()[0] >= arr[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    NSL[count++] = pseudoIndex;
                }else{
                    NSL[count++] = stack.peek()[1];
                }
            }
            stack.push(new int[] {arr[i] , i});
        }
        return NSL;
    }

    static int[] NearestSR(int[] arr){
        int pseudoIndex = 7;
        Stack<int[]> stack = new Stack<>();
        int[] NSR = new int[arr.length];
        int count = 0;
        for(int i = arr.length-1; i>= 0; i--){
            if(stack.size() == 0){
                NSR[count++] = pseudoIndex;
            }
            else if(stack.size() > 0 && stack.peek()[0] < arr[i]){
                NSR[count++] = stack.peek()[1];
            }
            else if(stack.size() > 0 && stack.peek()[0] >= arr[i]){
                while(stack.size() > 0 && stack.peek()[0] >= arr[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    NSR[count++] = pseudoIndex;
                }else{
                    NSR[count++] = stack.peek()[1];
                }
            }
            stack.push(new int[] {arr[i] , i});
        }
        return NSR;
    }

    public static void main(String[] args) {
        int[] nums = {6, 2, 5, 4, 5, 1, 6};
        int[] width = MaxAreaHist(nums);

        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i] * width[i];
        }
        System.out.println("Area : - " + Arrays.toString(nums));
        int largeNo = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] > largeNo){
                largeNo = nums[i];
            }
        }
        System.out.println("The required Max Area is :- " + largeNo);
    }
}
