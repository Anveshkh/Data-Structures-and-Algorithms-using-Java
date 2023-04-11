package BinarySearch;

// Nearly sorted array means the element at ith index can be present at either [i, i-1 or i+1] index

public class NearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 40, 35};
        int target = 40;
        System.out.println(search(arr, target, 0, arr.length));
    }

    static int search(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid + 1] == target){
                return mid + 1;
            }
            else if(arr[mid - 1] == target){
                return mid - 1;
            }
            else if(arr[mid] > target){
                end = mid - 2;
            }
            else if(arr[mid] < target){
                start = mid + 2;
            }
        }
        return -1;
    }

}
