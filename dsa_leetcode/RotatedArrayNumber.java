package dsa_leetcode;

// Find how many times array has been rotated
// we need to find the minimum element in the array

public class RotatedArrayNumber {
    public static void main(String[] args) {
        int[] arr = {11, 12, 15, 18, 2, 5, 6, 8};
        int ans = bs(arr);
        System.out.println("Array has been repeated " + ans + " times");
    }

    static int bs(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s + (e - s)/2;
            int next = (mid + 1) % (arr.length);
            int prev = (mid + arr.length - 1) % (arr.length);

            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return mid;
            }
            else if(arr[mid] <= arr[e] ){
                // front array is sorted
                e = mid - 1;
            }
            else if(arr[mid] >= arr[s]){
                // end array is sorted
                s = mid + 1;
            }
        }
        return -1;
    }
}
