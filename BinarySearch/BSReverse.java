package BinarySearch;

// Binary Search on a reverse sorted array

public class BSReverse {
    public static void main(String[] args) {
        int[] arr = {22, 21, 10, 8, 7, 5, 3, 1};
        int target = 21;
        int ans = ReverseBS(arr, 0, arr.length-1, target);
        System.out.println("Target is at " + ans + " index");
    }

    public static int ReverseBS(int[] arr, int s, int e, int target){
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return -1;
    }
}
