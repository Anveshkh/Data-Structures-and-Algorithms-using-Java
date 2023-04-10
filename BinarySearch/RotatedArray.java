package BinarySearch;

// Find the number of times a sorted array is rotated

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {8, 11, 12, 15, 18, 2, 5, 6};
        int num = Count(arr, 0, arr.length-1);
        System.out.println("Sorted array is rotated " + (arr.length - num) + " times");
    }
    static int Count(int[] arr, int s, int e){
        while(s <= e){
            int mid = s + (e - s)/2;
            int next = (mid + 1) % (arr.length);
            int prev = (mid + arr.length -1) % (arr.length);
            if(arr[s] <= arr[e]){
                return s;
            }
            else if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }
            else if(arr[mid] <= arr[e]){
                e = mid - 1;
            }
            else if(arr[mid] >= arr[s]){
                s = mid + 1;
            }
        }
        return -1;
    }
}
