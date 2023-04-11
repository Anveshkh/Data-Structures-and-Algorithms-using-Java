package BinarySearch;

// Search in Rotated Sorted Array

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {11, 12, 15, 18, 2, 5, 6, 8};
        int target = 8;
        int index = search(arr, target, 0, arr.length-1);
        int first = binarySearch(arr, target, 0, index-1);
        int second = binarySearch(arr, target, index, arr.length-1);

        if(first == 0 && second == 0){
            System.out.println("-1");
        }else if(first == -1){
            System.out.println(second);
        }
        else{
            System.out.println(first);
        }
    }

    static int search(int[] arr, int target, int start, int end){
        // first we need to calculate the middle element
        while(start <= end){
            int mid = start + (end - start)/2;
            int next = (mid + 1) % (arr.length);
            int prev = (mid + arr.length -1) % (arr.length);

            if(arr[start] <= arr[end]){
                return start;
                // array is not rotated
            }
            else if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return mid;
            }
            else if(arr[mid] >= arr[start]){
                start = mid + 1;
            }
            else if(arr[mid] <= arr[end]){
                end = mid - 1;
            }
        }
        return -1;

    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }

}
