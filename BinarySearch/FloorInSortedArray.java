package BinarySearch;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 8, 10, 12};
        int target = 11;
        System.out.println(floor(arr, target));
    }
    static int floor(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int potans = -1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(arr[m] == target){
                return arr[m];
            }
            else if(target < arr[m]){
                e = m - 1;
            }
            else if(target > arr[m]){
                s = m + 1;
            }
        }
        potans = arr[e];
        return potans;
    }
}
