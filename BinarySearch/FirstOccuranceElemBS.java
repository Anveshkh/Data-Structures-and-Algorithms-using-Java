package BinarySearch;

// Find the first and last occurance of an element

public class FirstOccuranceElemBS {
    public static void main(String[] args) {
        int[] arr= {2, 4, 10, 10, 10, 10, 10, 10, 18, 18, 18, 20};
        int target = 18;
        int sol = FirstOccurance(arr, 0, arr.length-1, target);
        System.out.println(sol);
    }

    static int FirstOccurance(int[] arr, int s, int e, int target){
        int possibleSol = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                possibleSol = mid;
                e = mid - 1;
            }
            else if(arr[mid] > target){
                e = mid - 1;
            }
            else if(arr[mid] < target){
                s = mid + 1;
            }

        }
        return possibleSol;
    }

}
