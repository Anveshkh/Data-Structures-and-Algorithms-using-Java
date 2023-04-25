package dsa_leetcode;

// The complexity is O(N*3)

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int max = 0;
        int i,j,k;
        for(i = 0; i<arr.length; i++){
            for(j = i; j<arr.length; j++){
                int sum = 0;
                // Calculate the sum of subarray between i and j
                for(k = i; k<= j; k++){
                    sum += arr[k];
                    max = Math.max(max, sum);
                }
            }
        }

        System.out.println(max);
    }
}
