package BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] arr= {1, 3, 5, 7, 9, 10};
        int target = 1;
        int ans = BinaryS(arr, 0, arr.length-1, target);
        System.out.println("Target is at index : " + ans);
    }
    public static int BinaryS(int[] arr, int s, int e, int target){


        while(s <= e){
            int m = s + (e - s)/2;
            if(arr[m] == target){
                return m;
            }
            else if(arr[m] < target){
                s = m + 1;
            }
            else if(arr[m] > target){
                e = m - 1;
            }
        }
        return -1;

    }
}
