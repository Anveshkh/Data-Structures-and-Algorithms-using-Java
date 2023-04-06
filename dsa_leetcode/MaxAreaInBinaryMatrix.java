package dsa_leetcode;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaInBinaryMatrix {
    public static void main(String[] args) {
        int[][] nums = {{0,1,1,0}, {1,1,1,1}, {1,1,1,1}, {1,1,0,0}};
        System.out.println("Hardwork pays off! ");
        System.out.println(maxArea(nums, 4, 4));

    }
    static int maxArea(int[][] nums, int r, int c){
        int[] newarr = new int[nums.length];
        int[] ans = new int[nums.length];
        int i,j;
        for(i= 0; i<c; i++){
            newarr[i] = nums[0][i];
        }
        ans[0] = MaxareaHist(newarr);
        for(i = 1; i<r; i++){
            for(j = 0; j<c; j++){
                if(nums[i][j] == 0){
                    newarr[j] = 0;
                }else{
                    newarr[j] = newarr[j] + nums[i][j];
                }
            }
            ans[i] = MaxareaHist(newarr);
        }

        int large = ans[0];
        for(i = 1 ; i<ans.length; i++){
            if(ans[i] > large){
                large = ans[i];
            }
        }
        return large;
    }

    private static int MaxareaHist(int[] newarr) {
        int[] NSR = nearestSR(newarr);
        int[] NSL = nearestSL(newarr);
        int[] width = new int[NSR.length];
        int i;
        for( i = 0; i<NSR.length; i++){
            width[i] = NSR[i] - NSL[i] - 1;
        }
        int max = width[0];

        for(i = 1; i<width.length; i++){
            if(width[i] > max){
                max = width[i];
            }
        }
        return max;
    }

    static int[] nearestSR(int[] nums){
        Stack<int[]> stack = new Stack<>();
        int[] NSR = new int[nums.length];
        int count = 0;
        int pseudoIndex = nums.length;

        for(int i = nums.length-1; i>=0 ; i--){
            if(stack.size() == 0){
                NSR[count++] = pseudoIndex;
            }else if(stack.size() > 0 && stack.peek()[0] < nums[i]){
                NSR[count++] = stack.peek()[1];
            }else if(stack.size() > 0 && stack.peek()[0] >= nums[i]){
                while(stack.size() > 0 && stack.peek()[0] >= nums[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    NSR[count++] = pseudoIndex;
                }else{
                    NSR[count++] = stack.peek()[1];
                }
            }
            int[] arr = {nums[i] , i};
            stack.push(arr);
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = NSR[nums.length-1-i];
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    static int[] nearestSL(int[] nums){
        Stack<int[]> stack = new Stack<>();
        int pseudoIndex = -1;
        int[] NSL = new int[nums.length];
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            if(stack.size() == 0){
                NSL[count++] = pseudoIndex;
            }else if(stack.size() > 0 && stack.peek()[0] < nums[i] ){
                NSL[count++] = stack.peek()[1];
            }else if(stack.size() > 0 && stack.peek()[0] >= nums[i]){
                while(stack.size() > 0 && stack.peek()[0] >= nums[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    NSL[count++] = pseudoIndex;
                }else{
                    NSL[count++] = stack.peek()[1];
                }
            }
            stack.push(new int[] {nums[i], i});
        }

        return NSL;
    }
}
