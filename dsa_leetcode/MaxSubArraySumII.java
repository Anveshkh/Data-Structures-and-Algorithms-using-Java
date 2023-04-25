package dsa_leetcode;

// Better Solution with Time complexity of O(n*2)

public class MaxSubArraySumII {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int n = arr.length;
        int first = better(arr, n);
        int second = optimal(arr, n);
        System.out.println("Answer through better = " + first);
        System.out.println("Answer through optimal = " + second);



    }

    static int better(int[] arr, int n){
        int max = 0;
        int i,j;
        for(i = 0; i<n; i++){
            int sum = 0;
            for(j = i ; j<n; j++){
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    // KADANE ALGORITHM IS USED
    /* This algorithm states that add current element to the sum if the sum is less than zero then it does not make sense
    * to take this sum as it will only reduce the addition of further elements thus we move to the next element and make
    * sum as zero .
    * If sum is greater than zero then we simply move to the next element by taking that sum*/
    static int optimal(int[] arr, int n){
        int max = 0;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
