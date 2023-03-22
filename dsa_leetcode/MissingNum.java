package dsa_leetcode;

public class MissingNum {

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    static int missingNumber(int[] nums){
        // Sort
        // find max number of elements
        // find every number from 0 to N
        // If any number is not found return that solution

        Partition(nums,0, nums.length-1);
        int size = nums[nums.length-1];

        for(int i =0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return size+1;
    }


    static void Partition(int[] arr, int lb, int ub){
        if(lb < ub){
            int loc = Quicksort(arr, lb, ub);
            Partition(arr, lb, loc-1);
            Partition(arr, loc+1, ub);
        }
    }

    static int Quicksort(int[] arr, int lb, int ub){
        int pivot = arr[lb];
        int start = lb, end = ub;
        while(start<end){
            while(arr[start] <= pivot){
                if(start < arr.length-1){
                    start++;
                }
                else{
                    break;
                }

            }
            while(arr[end] > pivot){
                end--;
            }

            if(start < end){
                swap(arr, start, end);
            }
        }
        swap(arr, lb, end);
        return end;
    }

    static void swap(int[] arr, int prev, int next){
        int temp = arr[prev];
        arr[prev] = arr[next];
        arr[next] = temp;
    }
}
