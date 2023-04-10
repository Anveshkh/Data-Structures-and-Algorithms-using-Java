package BinarySearch;

import static BinarySearch.BS.BinaryS;
import static BinarySearch.BSReverse.ReverseBS;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        int[] arr = {22, 21, 15, 12, 11, 10};
        int target = 22;
        OrderAgnostic(arr, 0, arr.length-1, target);
    }

    static void OrderAgnostic(int[] arr, int s, int e, int target){

        if(arr[s] < arr[e]){
            // Ascending sorted
            int ans =  BinaryS(arr, 0, arr.length-1, target);
            System.out.println("index = " + ans);
        }
        else{
            // Descending sorted
            int ans = ReverseBS(arr, 0, arr.length-1, target);
            System.out.println("index = " + ans);
        }

    }

}
