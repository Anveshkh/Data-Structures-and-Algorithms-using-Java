package BinarySearch;

// Find the last occurance of the element


public class LastOccuranceElemBs {
    public static void main(String[] args) {
        int[] arr = {8, 10, 10, 10, 10, 10, 15, 17, 18};
        int target = 17;
        int sol = lastOccurance(arr, 0, arr.length-1, target);
        System.out.println(sol);
    }

    static int lastOccurance(int[] arr, int s, int e, int target){
        int possibleSolution = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                possibleSolution = mid;
                s = mid + 1;
            }
            else if(target < arr[mid]){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return possibleSolution;
    }
}
