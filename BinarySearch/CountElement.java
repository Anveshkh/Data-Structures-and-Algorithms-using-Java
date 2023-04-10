package BinarySearch;

// Count the number of elements in a sorted array

public class CountElement {
    public static void main(String[] args) {
        int[] arr = {8, 10, 10, 10, 10, 10, 15, 15, 15,  17, 18};
        int target = 15;
        int count;
        int first = firstOccurance(arr, 0, arr.length-1, target);
        int last = lastOccurance(arr, 0, arr.length-1, target);
        if(first == -1 && last == -1){
            count = -1;
        }
        else{
            count = last - first + 1;
        }
        System.out.println(target + " is present " + count + " times");
    }

    static int firstOccurance(int[] arr, int s, int e, int target){
        int possibleSol = -1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(target == arr[mid]){
                possibleSol = mid;
                e = mid - 1;
            }
            else if(target < arr[mid]){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }

        return possibleSol;

    }
    static int lastOccurance(int[] arr, int s, int e, int target){
        int possibleSol = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(target == arr[mid]){
                possibleSol = mid;
                s = mid + 1;
            }
            else if(target < arr[mid]){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return possibleSol;
    }
}
